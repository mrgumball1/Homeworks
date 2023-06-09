package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it
 * to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Toyota());
        carList.add(new Supra());
        carList.add(new Bmw());
        carList.add(new Audi());
        carList.add(new Tesla());
        carList.add(new Lexus());
        carList.add(new Honda());


        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                if (i == 2 && car instanceof TunedCar) {
                    ((TunedCar) car).useNitrousOxideEngine();
                } else {
                    car.speedUp();
                }
            }
        }
        Car fastestCar = findFastestCar(carList);
        System.out.println(fastestCar.getClass().getSimpleName()
                + " " + fastestCar.showCurrentSpeed());

    }

    public static Car findFastestCar(List<Car> carlist) {
        int maxSpeed = 0;
        Car fastestCar = null;
        for (Car car : carlist) {
            String carCurrentSpeed = car.showCurrentSpeed();
            if (Integer.parseInt(carCurrentSpeed) > maxSpeed) {
                maxSpeed = Integer.parseInt(carCurrentSpeed);
                fastestCar = car;
            }
        }
        return fastestCar;
    }
}
