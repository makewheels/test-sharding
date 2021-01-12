package com.eg.testsharding.bean;

import lombok.Data;

@Data
public class Poem {
    private Long id;

    private String title;

    private String dynasty;

    private String author;

    private String paragraphs;

}