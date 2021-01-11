package com.eg.testsharding.bean.mapper;

import com.eg.testsharding.bean.Poem;
import com.eg.testsharding.bean.PoemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PoemMapper {
    long countByExample(PoemExample example);

    int deleteByExample(PoemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Poem record);

    int insertSelective(Poem record);

    List<Poem> selectByExample(PoemExample example);

    Poem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Poem record, @Param("example") PoemExample example);

    int updateByExample(@Param("record") Poem record, @Param("example") PoemExample example);

    int updateByPrimaryKeySelective(Poem record);

    int updateByPrimaryKey(Poem record);
}