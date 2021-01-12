package com.eg.testsharding.bean.mapper;

import com.eg.testsharding.bean.Dynasty;
import com.eg.testsharding.bean.DynastyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DynastyMapper {
    long countByExample(DynastyExample example);

    int deleteByExample(DynastyExample example);

    int insert(Dynasty record);

    int insertSelective(Dynasty record);

    List<Dynasty> selectByExample(DynastyExample example);

    int updateByExampleSelective(@Param("record") Dynasty record, @Param("example") DynastyExample example);

    int updateByExample(@Param("record") Dynasty record, @Param("example") DynastyExample example);
}