package com.eg.testsharding.prepare;

import com.alibaba.fastjson.JSON;
import com.eg.testsharding.TestShardingApplication;
import com.eg.testsharding.bean.Author;
import com.eg.testsharding.bean.Poem;
import com.eg.testsharding.bean.mapper.AuthorMapper;
import com.eg.testsharding.bean.mapper.PoemMapper;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 准备古诗
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestShardingApplication.class})
public class PrepareDatabase {
    @Autowired
    private PoemMapper poemMapper;
    @Autowired
    private AuthorMapper authorMapper;

    @Test
    public void insertPoems() throws IOException {
        File folder = new File(PrepareDatabase.class.getResource("/poems/poet").getPath());
        File[] files = folder.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            String jsonString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            List<Poem> poemList = JSON.parseArray(jsonString, Poem.class);
            for (Poem poem : poemList) {
                if (file.getName().contains("song")) {
                    poem.setDynasty("宋");
                } else if (file.getName().contains("tang")) {
                    poem.setDynasty("唐");
                }
                poemMapper.insert(poem);
                System.out.println(poem);
            }
        }
    }

    @Test
    public void insertAuthors() throws IOException {
        File folder = new File(PrepareDatabase.class.getResource("/poems/authors").getPath());
        File[] files = folder.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            String jsonString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            List<Author> authorList = JSON.parseArray(jsonString, Author.class);
            for (Author author : authorList) {
                authorMapper.insert(author);
                System.out.println(author);
            }
        }
    }
}
