package io.codelex.polymorphism.practice.exercise6;


public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeight;
    protected int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    protected void howManyTimeEaten(int quantity) {
        this.foodEaten += quantity;
    }

    abstract void makeSound();

    abstract void eat(Food food);

}
