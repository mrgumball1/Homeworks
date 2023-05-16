package io.codelex.classesandobjects.practice.Exercise3;

public class TestOfOdomAndFuelG {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge();
        fuelGauge.getCurFuel();
        fuelGauge.incrementOfFuel();

        for (int i = 0; i < 100; i++) {
            fuelGauge.incrementOfFuel();
        }
        Odometer odometer = new Odometer(fuelGauge);
        while (odometer.getFuelGauge().getCurFuel() != 0){
            odometer.incrementMileage();
            System.out.println(odometer.getCurMileage());
        }

    }

}
