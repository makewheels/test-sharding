package com.eg.testsharding.github;

import lombok.Data;

import java.util.List;
@Data
public class GithubPoem {
    private String author;
    private List<String> paragraphs;
    private String title;
    private String id;
}
