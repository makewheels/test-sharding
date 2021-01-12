package com.eg.testsharding.controller;

import com.eg.testsharding.bean.mapper.AuthorMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("author")
public class AuthorController {
    @Resource
    private AuthorMapper authorMapper;

    /**
     * count
     * http://localhost:8080/test-sharding/author/countAuthors
     *
     * @return
     */
    @RequestMapping("countAuthors")
    @ResponseBody
    public long countPoems() {
        return authorMapper.countByExample(null);
    }

}
