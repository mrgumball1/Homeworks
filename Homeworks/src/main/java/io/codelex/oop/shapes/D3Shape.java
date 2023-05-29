package io.codelex.oop.shapes;

abstract class D3Shape extends Shape {
    public D3Shape(int numSides) {
        super(numSides);
    }

    abstract void calculateVolume();
}
