package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("PFffRRRRR");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            howManyTimeEaten(food.quantity);

        } else {
            System.out.println(getClass().getSimpleName() + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
