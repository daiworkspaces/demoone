package com.newdemoone.demoone.mapper;

import com.newdemoone.demoone.domain.InfList;
import com.newdemoone.demoone.domain.InfListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfListMapper {
    long countByExample(InfListExample example);

    int deleteByExample(InfListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InfList record);

    int insertSelective(InfList record);

    List<InfList> selectByExample(InfListExample example);

    InfList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InfList record, @Param("example") InfListExample example);

    int updateByExample(@Param("record") InfList record, @Param("example") InfListExample example);

    int updateByPrimaryKeySelective(InfList record);

    int updateByPrimaryKey(InfList record);
}