package com.cybercitycode.stackoverflowsystem;

import com.cybercitycode.stackoverflowsystem.dto.QuestionDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StackOverflowSystemApplication {

    public static void main(String[] args) {
        QuestionDTO questionDTO = QuestionDTO.builder()
                .description("Test")
                .title("Test question")
                .build();

        SpringApplication.run(StackOverflowSystemApplication.class, args);
    }

}
