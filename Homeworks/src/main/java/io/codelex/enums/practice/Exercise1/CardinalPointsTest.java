package io.codelex.enums.practice.Exercise1;

public class CardinalPointsTest {
    public static void main(String[] args) {
        for (CardinalPoints direction : CardinalPoints.values()) {
            switch (direction) {
                case NORTH -> System.out.println("Direction: North, Text: " + direction.getDirection());
                case SOUTH -> System.out.println("Direction: South, Text: " + direction.getDirection());
                case EAST -> System.out.println("Direction: East, Text: " + direction.getDirection());
                case WEST -> System.out.println("Direction: West, Text: " + direction.getDirection());
            }
        }
        for (CardinalPoints direction : CardinalPoints.values()) {
            System.out.println(direction.name() + ":" + direction.getDirection() + ":" + direction.ordinal());
        }
    }
}