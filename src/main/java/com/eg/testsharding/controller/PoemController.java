package com.eg.testsharding.controller;

import com.alibaba.fastjson.JSON;
import com.eg.testsharding.bean.Poem;
import com.eg.testsharding.bean.PoemExample;
import com.eg.testsharding.bean.mapper.PoemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("poem")
public class PoemController {
    @Resource
    private PoemMapper poemMapper;

    /**
     * http://localhost:8080/test-sharding/poem/getById?id=4
     *
     * @param id
     * @return
     */
    @RequestMapping("getById")
    @ResponseBody
    public String getById(@RequestParam long id) {
        Poem poem = poemMapper.selectByPrimaryKey(id);
        return JSON.toJSONString(poem);
    }

    /**
     * http://localhost:8080/test-sharding/poem/queryByParagraphs?paragraphs=%E7%AE%80%E4%BA%BA
     *
     * @param paragraphs
     * @return
     */
    @RequestMapping("queryByParagraphs")
    @ResponseBody
    public String queryByParagraphs(@RequestParam String paragraphs) {
        PoemExample poemExample = new PoemExample();
        poemExample.createCriteria().andParagraphsLike("%" + paragraphs + "%");
        List<Poem> poemList = poemMapper.selectByExample(poemExample);
        return JSON.toJSONString(poemList);
    }

}
