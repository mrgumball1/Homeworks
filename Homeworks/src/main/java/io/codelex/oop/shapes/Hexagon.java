package io.codelex.oop.shapes;

public class Hexagon extends Shape {
    private int width;
    private int height;

    public Hexagon(int numSides, int height, int width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    int getArea() {
        double area = (6*(height*height))/(4*Math.tan(Math.PI/6));
        return (int )area;
    }

    @Override
    int getPerimeter() {
        int perimeter = width * 6;
        return perimeter;
    }
}
