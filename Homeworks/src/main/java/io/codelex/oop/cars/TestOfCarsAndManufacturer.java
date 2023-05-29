package io.codelex.oop.cars;

import java.util.Arrays;
import java.util.List;

public class TestOfCarsAndManufacturer {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Ford", 1995, "USA");
        Manufacturer manufacturer2 = new Manufacturer("TOYOTA", 2000, "JAPAN");
        Manufacturer manufacturer3 = new Manufacturer("GENERAL MOTORS", 1985, "USA");
        Manufacturer manufacturer4 = new Manufacturer("VOLVO", 1998, "SWEDEN");

        Car car1 = new Car("Focus", "Model 1", 50000, 1990, Arrays.asList(manufacturer1, manufacturer2), EngineType.V8);
        Car car2 = new Car("Avensis", "Model 2", 60000, 2005, Arrays.asList(manufacturer1, manufacturer3), EngineType.V12);
        Car car3 = new Car("Viper", "Model 3", 70000, 1980, Arrays.asList(manufacturer2, manufacturer4), EngineType.S6);
        Car car4 = new Car("XC", "Model 4", 80000, 1995, Arrays.asList(manufacturer3, manufacturer4), EngineType.V6);

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("All Cars:");
        List<Car> allCars = carService.getAllCars();
        for (Car car : allCars) {
            System.out.println(car.getName());
        }

        System.out.println("Cars with V12 Engine:");
        List<Car> v12EngineCars = carService.getCarsWithV12Engine();
        for (Car car : v12EngineCars) {
            System.out.println(car.getName());
        }

        System.out.println("Cars produced before 1999:");
        List<Car> carsBefore1999 = carService.getCarsProducedBeforeYear(1999);
        for (Car car : carsBefore1999) {
            System.out.println(car.getName());
        }

        System.out.println("Most Expensive Car:");
        Car mostExpensiveCar = carService.getMostExpensiveCar();
        System.out.println(mostExpensiveCar.getName());

        System.out.println("Cheapest Car:");
        Car cheapestCar = carService.getCheapestCar();
        System.out.println(cheapestCar.getName());

        System.out.println("Cars with at least 3 Manufacturers:");
        List<Car> carsWithMultipleManufacturers = carService.getCarsWithMultipleManufacturers(3);
        for (Car car : carsWithMultipleManufacturers) {
            System.out.println(car.getName());
        }

        System.out.println("Sorted Cars (Descending):");
        List<Car> sortedCarsDescending = carService.getSortedCars(false);
        for (Car car : sortedCarsDescending) {
            System.out.println(car.getName());
        }

        System.out.println("Is Car 1 in the list: " + carService.containsCar(car1));

        System.out.println("Cars manufactured by Manufacturer 1:");
        List<Car> carsByManufacturer = carService.getCarsByManufacturer(manufacturer1);
        for (Car car : carsByManufacturer) {
            System.out.println(car.getName());
        }

        System.out.println("Cars manufactured by Manufacturer with year of establishment < 2000:");
        List<Car> carsByManufacturerAndYear = carService.getCarsByManufacturerAndEstablishmentYear(manufacturer1, "<", 2000);
        for (Car car : carsByManufacturerAndYear) {
            System.out.println(car.getName());
        }
    }

}
