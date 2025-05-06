package com.cybercitycode.stackoverflowsystem.controller;

import com.cybercitycode.stackoverflowsystem.model.Question;
import com.cybercitycode.stackoverflowsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/latest")
    public List<Question> getLatestQuestions() {
        return questionService.getLatestQuestions();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody QuestionDTO dto) {
        questionService.addQuestion(dto.getTitle(), dto.getDescription(), dto.getTags(), dto.getUser());
        return ResponseEntity.ok("Question added.");
    }
}
