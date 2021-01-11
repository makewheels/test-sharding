package com.eg.testsharding.controller;

import com.alibaba.fastjson.JSON;
import com.eg.testsharding.bean.Poem;
import com.eg.testsharding.bean.mapper.PoemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("poem")
public class PoemController {
    @Resource
    private PoemMapper poemMapper;

    @RequestMapping("get")
    @ResponseBody
    public String getById(@RequestParam long id) {
        Poem poem = poemMapper.selectByPrimaryKey(id);
        return JSON.toJSONString(poem);
    }

}
