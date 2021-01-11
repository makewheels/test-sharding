package com.eg.testsharding.prepare;

import com.alibaba.fastjson.JSON;
import com.eg.testsharding.TestShardingApplication;
import com.eg.testsharding.bean.Author;
import com.eg.testsharding.bean.Poem;
import com.eg.testsharding.bean.mapper.AuthorMapper;
import com.eg.testsharding.bean.mapper.PoemMapper;
import com.eg.testsharding.util.SimplifiedAndTraditionalUtil;
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
        long id = 1;
        for (File file : files) {
            String jsonString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            List<Poem> poemList = JSON.parseArray(jsonString, Poem.class);
            for (Poem poem : poemList) {
                //朝代
                if (file.getName().contains("song")) {
                    poem.setDynasty("宋");
                } else if (file.getName().contains("tang")) {
                    poem.setDynasty("唐");
                }
                //github原本是，没一句诗是组成列表，我把它直接拼接到一起
                List<String> paragraphList = JSON.parseArray(poem.getParagraphs(), String.class);
                StringBuilder paragraphs = new StringBuilder();
                for (String paragraph : paragraphList) {
                    paragraphs.append(paragraph);
                }
                poem.setParagraphs(paragraphs.toString());
                //最后一步，繁体转简体
                poem.setTitle(SimplifiedAndTraditionalUtil.traditionalToSimplified(poem.getTitle()));
                poem.setAuthor(SimplifiedAndTraditionalUtil.traditionalToSimplified(poem.getAuthor()));
                poem.setParagraphs(SimplifiedAndTraditionalUtil.traditionalToSimplified(poem.getParagraphs()));
                //设置id
                poem.setId(id);
                System.out.println(id);
                id++;
                //保存到数据库
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
        long id = 1;
        for (File file : files) {
            String jsonString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            List<Author> authorList = JSON.parseArray(jsonString, Author.class);
            for (Author author : authorList) {
                //设置id
                author.setId(id);
                id++;
                //最后一步，繁体转简体
                author.setName(SimplifiedAndTraditionalUtil.traditionalToSimplified(author.getName()));
                author.setDescription(SimplifiedAndTraditionalUtil.traditionalToSimplified(author.getDescription()));
                authorMapper.insert(author);
                System.out.println(author);
            }
        }
    }

}
