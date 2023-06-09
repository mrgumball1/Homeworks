package io.codelex.polymorphism.practice.exercise1;

public class Supra implements Car{
    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed = currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed = currentSpeed -= 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("BRRRAAARRRA STUTUTUTUTTu");
    }
}