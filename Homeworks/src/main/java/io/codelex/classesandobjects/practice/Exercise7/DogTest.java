package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male");
        Dog dog2 = new Dog("Rocky", "male");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female");

        dog1.setMother(dog6);
        dog1.setFather(dog2);
        dog8.setMother(dog7);
        dog8.setFather(dog4);
        dog2.setMother(dog7);
        dog2.setFather(dog5);
        dog4.setMother(dog6);
        dog4.setFather(dog3);
        System.out.println(dog2.hasSameMotherAs(dog8));
        System.out.println(dog2.hasSameMotherAs(dog4));
        System.out.println(dog1.fathersName());
        System.out.println(dog1.toString());
        System.out.println(dog3.fathersName());
    }
}
