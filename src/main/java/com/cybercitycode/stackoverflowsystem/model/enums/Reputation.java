package com.cybercitycode.stackoverflowsystem.model.enums;

public enum Reputation {
    NOVICE(100),
    INTERMEDIATE(500),
    ADVANCE(1000);

    private final int points;

    Reputation(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
