package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    int getArea() {
        int area = (height * width) / 2;
        return area;
    }

    @Override
    int getPerimeter() {
        int perimeter = width * 3;
        return perimeter;
    }
}
