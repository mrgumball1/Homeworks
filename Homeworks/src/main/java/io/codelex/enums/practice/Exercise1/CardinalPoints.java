package io.codelex.enums.practice.Exercise1;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");
    private final String DIRECTION;

    CardinalPoints(String direction) {
        this.DIRECTION = direction;
    }

    public String getDirection() {
        return DIRECTION;
    }
}
