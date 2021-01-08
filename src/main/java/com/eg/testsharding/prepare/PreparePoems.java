package com.eg.testsharding.prepare;

import com.alibaba.fastjson.JSON;
import com.eg.testsharding.bean.Poem;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 准备古诗
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PreparePoems {

    @Test
    public void insertPoems() throws IOException {
        File poemsFolder = new File(PreparePoems.class.getResource("/poems").getPath());
        File[] files = poemsFolder.listFiles();
        for (File file : files) {
            //如果是诗词文件
            if (file.getName().startsWith("poet")) {
                String jsonString = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
                List<Poem> poemList = JSON.parseArray(jsonString, Poem.class);
                for (Poem poem : poemList) {
                    System.out.println(poem);
                }
            }
        }
    }
}
