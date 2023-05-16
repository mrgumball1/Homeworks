package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {
    private double curFuel;

    public  FuelGauge() {
        this.curFuel = 0;
    }

    public double getCurFuel() {
        return this.curFuel;
    }
    public void incrementOfFuel() {
        if (this.curFuel < 70) {
            this.curFuel++;
        }
    }
    public void decrementOfFuel() {
        if (this.curFuel > 0) {
            this.curFuel--;
        }
    }
}
