package com.cybercitycode.stackoverflowsystem.service;

import com.cybercitycode.stackoverflowsystem.model.Question;
import com.cybercitycode.stackoverflowsystem.model.Tag;
import com.cybercitycode.stackoverflowsystem.model.User;

import com.cybercitycode.stackoverflowsystem.model.enums.StatusType;
import com.cybercitycode.stackoverflowsystem.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class QuestionService {
    @Autowired
    private QuestionRepository questionRepo;

    public List<Question> getLatestQuestions() {
        return questionRepo.findAll(Sort.by(Sort.Direction.DESC, "createdDate"));
    }

    public void addQuestion(String title, String description, List<Tag> tags, User user) {
        Question q = new Question();
        q.setId(UUID.randomUUID());
        q.setTitle(title);
        q.setDescription(description);
        q.setTags(tags);
        q.setUser(user);
        q.setStatus(StatusType.ACTIVE);
        q.setCreatedDate(LocalDateTime.now());
        questionRepo.save(q);
    }
}