package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {
    private String breed;
    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void eat(Food food) {
        System.out.println(getClass().getSimpleName() + " eat any kind of food!");
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %s]", getClass().getSimpleName(), animalName, breed, animalWeight, livingRegion, foodEaten);
    }
}
