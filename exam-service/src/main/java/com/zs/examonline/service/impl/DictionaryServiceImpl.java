package com.zs.examonline.service.impl;

import com.zs.examonline.dao.DictionaryMapper;
import com.zs.examonline.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryMapper dictionaryMapper ;

    @Override
    public List<String> findMajors() {
        return dictionaryMapper.findMajors();
    }

    @Override
    public List<String> findCourses() {
        return dictionaryMapper.findCourses();
    }
}
