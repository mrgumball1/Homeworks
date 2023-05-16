package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;
    private int mileage;

    public Car(double startKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.liters = liters;
    }
    public void fillUp( int mileage, double liters){
        endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double traveledKilometers = endKilometers - startKilometers;
        return (liters * 100) / traveledKilometers;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }
}
