package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        String input = scanner.nextLine();

        while (true) {
            if (input.equalsIgnoreCase("End")) {
                break;
            }
            String[] partsOfInput = input.split("\\s+");
            String animalType = partsOfInput[0];
            String animalName = partsOfInput[1];
            double animalWeight = Double.parseDouble(partsOfInput[2]);
            String animalLivingRegion = partsOfInput[3];
            String catBreed = partsOfInput[4];


            Animal animal = switch (animalType) {
                case "Cat" -> new Cat(animalType, animalName, animalWeight, animalLivingRegion, catBreed);
                case "Tiger" -> new Tiger(animalType, animalName, animalWeight, animalLivingRegion);
                case "Zebra" -> new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
                case "Mouse" -> new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
                default -> null;
            };
            animal.makeSound();
            String foodType = scanner.next();
            int amount = scanner.nextInt();
            Food food = null;
            if ("Vegetable".equals(foodType)) {
                food = new Vegetable(amount);
            } else if ("Meat".equals(foodType)) {
                food = new Meat(amount);
            } else if (foodType.equalsIgnoreCase("End")) {
                break;
            }
            animal.eat(food);
            animalList.add(animal);
        }
        animalList.forEach(System.out::print);
    }
}

