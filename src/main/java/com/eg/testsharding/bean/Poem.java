package com.eg.testsharding.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Poem {
    private Long id;

    @JSONField(name = "id")
    private String poemId;
    private String title;
    private String author;
    private List<String> paragraphs;
}
