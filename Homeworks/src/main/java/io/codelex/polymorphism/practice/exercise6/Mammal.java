package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]", getClass().getSimpleName(), animalType, animalName, animalWeight, foodEaten);
    }
}
