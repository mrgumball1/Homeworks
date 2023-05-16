package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {
    private int curMileage;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.curMileage = 0;
        this.fuelGauge = fuelGauge;
    }

    public FuelGauge getFuelGauge() {
        return this.fuelGauge;
    }
    public int getCurMileage() {
        return this.curMileage;
    }

    public void incrementMileage() {
        if (this.curMileage >= 999999) {
            this.curMileage = 0;
        } else {
            this.curMileage++;
        }
        if (this.curMileage % 10 == 0) {
            this.fuelGauge.decrementOfFuel();
        }

    }
}