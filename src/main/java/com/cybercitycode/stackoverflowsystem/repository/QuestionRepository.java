package com.cybercitycode.stackoverflowsystem.repository;

import com.cybercitycode.stackoverflowsystem.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository<Question, UUID> {
}