package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    int getArea() {
        int area = height * width;
        return area;
    }

    @Override
    int getPerimeter() {
        int perimeter = 2 * (height + width);
        return perimeter;
    }

}
