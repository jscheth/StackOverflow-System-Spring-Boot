package com.cybercitycode.stackoverflowsystem.model;

import com.cybercitycode.stackoverflowsystem.model.enums.Reputation;
import com.cybercitycode.stackoverflowsystem.model.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String userName, firstName, lastName;
    private int reputationPoint;

    private Reputation reputationStatus;
    private UserStatus status;

    private LocalDateTime createdDate, updatedDate;

    private List<Answer> answers;
    private List<Question> questions;

    public void calculateReputation() {
        // Dummy calculation logic
        this.reputationStatus = (reputationPoint >= 1000) ? Reputation.ADVANCE :
                (reputationPoint >= 500) ? Reputation.INTERMEDIATE : Reputation.NOVICE;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getReputationPoint() {
        return reputationPoint;
    }

    public void setReputationPoint(int reputationPoint) {
        this.reputationPoint = reputationPoint;
    }

    public Reputation getReputationStatus() {
        return reputationStatus;
    }

    public void setReputationStatus(Reputation reputationStatus) {
        this.reputationStatus = reputationStatus;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
