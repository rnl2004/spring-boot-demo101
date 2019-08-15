package com.example.controller;

import com.example.model.Question;
import com.example.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
    public Page<Question> getQuestions(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @PostMapping(value = "/questions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Question createQuestion(@Valid @RequestBody Question question) {
        System.out.println(question.getDescription());
        return questionRepository.save(question);
    }
}
