package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType() == EngineType.V12) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCarsProducedBeforeYear(int year) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < year) {
                result.add(car);
            }
        }
        return result;
    }

    public Car getMostExpensiveCar() {
        if (carList.isEmpty()) {
            return null;
        }
        Car mostExpensiveCar = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        if (carList.isEmpty()) {
            return null;
        }
        Car cheapestCar = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice() < cheapestCar.getPrice()) {
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public List<Car> getCarsWithMultipleManufacturers(int minManufacturerCount) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturers().size() >= minManufacturerCount) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getSortedCars(boolean ascending) {
        List<Car> sortedList = new ArrayList<>(carList);
        if (ascending) {
            sortedList.sort(Comparator.comparingDouble(Car::getPrice));
        } else {
            sortedList.sort(Comparator.comparingDouble(Car::getPrice).reversed());
        }
        return sortedList;
    }

    public boolean containsCar(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturers().contains(manufacturer)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCarsByManufacturerAndEstablishmentYear(Manufacturer manufacturer, String comparisonOperator, int year) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer carManufacturer : car.getManufacturers()) {
                if (carManufacturer.equals(manufacturer)) {
                    int carManufacturerYear = carManufacturer.getYearOfEstablishment();
                    switch (comparisonOperator) {
                        case "<" -> {
                            if (carManufacturerYear < year) {
                                result.add(car);
                            }
                        }
                        case ">" -> {
                            if (carManufacturerYear > year) {
                                result.add(car);
                            }
                        }
                        case "<=" -> {
                            if (carManufacturerYear <= year) {
                                result.add(car);
                            }
                        }
                        case ">=" -> {
                            if (carManufacturerYear >= year) {
                                result.add(car);
                            }
                        }
                        case "=" -> {
                            if (carManufacturerYear == year) {
                                result.add(car);
                            }
                        }
                        case "!=" -> {
                            if (carManufacturerYear != year) {
                                result.add(car);
                            }
                        }
                        default ->
                                throw new IllegalArgumentException("Invalid comparison operator: " + comparisonOperator);
                    }
                    break;
                }
            }
        }
        return result;
    }
}
