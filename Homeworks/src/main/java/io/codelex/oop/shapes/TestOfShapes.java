package io.codelex.oop.shapes;

public class TestOfShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5, 3);
        Triangle triangle = new Triangle(3, 6, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
