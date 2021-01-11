package com.eg.testsharding.bean;

import lombok.Data;

@Data
public class Poem {
    private Long id;        //MySQL自增id

//    @JSONField(name = "id")
    private String poemId;  //github上的，诗的id，就用它的吧，反正是唯一的
    private String title;
    private String dynasty; //哪个朝代的，从json文件名获得
    private String author;
    private String paragraphs;

}
