package com.eg.testsharding.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Author {
    private Long id;
    private String name;    //诗人名

    @JSONField(name = "id")
    private String authorId;

    @JSONField(name = "desc")
    private String description;
}
