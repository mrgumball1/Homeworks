package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    void makeSound() {
        System.out.println("RAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
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
