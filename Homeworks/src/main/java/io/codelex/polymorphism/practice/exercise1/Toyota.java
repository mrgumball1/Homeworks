package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car{
    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed = currentSpeed += 9;
    }

    @Override
    public void slowDown() {
        currentSpeed = currentSpeed -= 9;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Tutututsrtututu");
    }
}
