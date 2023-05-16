package io.codelex.classesandobjects.practice.Exercise2;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(100, 60);
        Car car2 = new Car(1030, 80);
        Car car3 = new Car(135, 30);
        Car car4 = new Car(156, 40);
        car1.fillUp(200,60);
        car2.fillUp(1090, 40);
        car3.fillUp(200, 3);
        car4.fillUp(300,40);


        System.out.println(car2.calculateConsumption());
        System.out.println(car2.gasHog());
        System.out.println(car2.economyCar());
        System.out.println(car3.calculateConsumption());
        System.out.println(car3.economyCar());
        System.out.println(car3.gasHog());
        System.out.println(car4.calculateConsumption());
    }
}
