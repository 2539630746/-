package com.zs.examonline.service;

import com.zs.examonline.domain.Question;

public interface QuestionService {

    void save(Question question) ;

    Question findById(Long id);

    void update(Question question);
}
