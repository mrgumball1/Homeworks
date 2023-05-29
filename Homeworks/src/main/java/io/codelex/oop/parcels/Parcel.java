package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        int sumOfDimension = xLength + yLength + zLength;
        if (sumOfDimension > 300) {
            System.out.println("error: The sum of dimension is too large");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("error: dimension must be bigger than 30");
            return false;
        }
        float maxWeight = isExpress ? 15.0f : 30.0f;
        if (weight > maxWeight) {
            System.out.println("error: its too heavy");
            return false;
        }
        return true;
    }
}
