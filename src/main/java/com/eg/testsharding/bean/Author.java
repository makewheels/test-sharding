package com.eg.testsharding.bean;

public class Author {
    private Long id;

    private Long sequence;

    private String name;

    private Integer dynasty;

    private String description;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDynasty() {
        return dynasty;
    }

    public void setDynasty(Integer dynasty) {
        this.dynasty = dynasty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}