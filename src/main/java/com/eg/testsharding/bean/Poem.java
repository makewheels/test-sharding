package com.eg.testsharding.bean;

public class Poem {
    private Long id;

    private Long sequence;

    private String title;

    private Integer dynasty;

    private String author;

    private String paragraphs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getDynasty() {
        return dynasty;
    }

    public void setDynasty(Integer dynasty) {
        this.dynasty = dynasty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(String paragraphs) {
        this.paragraphs = paragraphs == null ? null : paragraphs.trim();
    }
}