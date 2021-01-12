package com.eg.testsharding.controller;

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
     * id查询
     * http://localhost:8080/test-sharding/poem/getById?id=555789045112766464
     *
     * @param id
     * @return
     */
    @RequestMapping("getById")
    @ResponseBody
    public Poem getById(@RequestParam long id) {
        return poemMapper.selectByPrimaryKey(id);
    }

    /**
     * 搜索
     * http://localhost:8080/test-sharding/poem/queryByParagraphs?paragraphs=%E7%AE%80%E4%BA%BA
     *
     * @param paragraphs
     * @return
     */
    @RequestMapping("queryByParagraphs")
    @ResponseBody
    public List<Poem> queryByParagraphs(@RequestParam String paragraphs) {
        PoemExample poemExample = new PoemExample();
        poemExample.createCriteria().andParagraphsLike("%" + paragraphs + "%");
        return poemMapper.selectByExample(poemExample);
    }

    /**
     * count
     * http://localhost:8080/test-sharding/poem/countPoems
     *
     * @return
     */
    @RequestMapping("countPoems")
    @ResponseBody
    public long countPoems() {
        return poemMapper.countByExample(null);
    }

}
