package com.cybercitycode.stackoverflowsystem.dto;

import com.cybercitycode.stackoverflowsystem.model.Tag;
import com.cybercitycode.stackoverflowsystem.model.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class QuestionDTO {
    private String title;
    private String description;
    private List<Tag> tags;
    private User user;


}
