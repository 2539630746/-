package com.zs.examonline.dao;

import com.zs.examonline.domain.Dictionary;

import java.util.List;

public interface DictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);



    List<String> findMajors() ;

    List<String> findCourses() ;

}