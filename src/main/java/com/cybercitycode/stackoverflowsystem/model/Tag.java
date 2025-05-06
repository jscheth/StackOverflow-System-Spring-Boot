package com.cybercitycode.stackoverflowsystem.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Tag {
    private UUID id;
    private String tagName;
    private LocalDateTime createdDate;
    private Long usage;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUsage() {
        return usage;
    }

    public void setUsage(Long usage) {
        this.usage = usage;
    }
}
