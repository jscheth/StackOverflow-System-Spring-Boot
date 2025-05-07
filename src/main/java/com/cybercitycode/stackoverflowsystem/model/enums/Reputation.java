package com.cybercitycode.stackoverflowsystem.model.enums;

import lombok.Getter;

public enum Reputation {
    NOVICE(100),
    INTERMEDIATE(500),
    ADVANCE(1000);

    @Getter
    private final int points;

    Reputation(int points) {
        this.points = points;
    }

//    public int getPoints() {
//        return points;
//    }
}
