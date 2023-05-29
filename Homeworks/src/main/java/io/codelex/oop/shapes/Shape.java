package io.codelex.oop.shapes;

public abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }
    abstract int getArea();
    abstract int getPerimeter();
}
