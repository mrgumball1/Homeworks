package io.codelex.classesandobjects.practice;

import java.awt.*;

public class swapPoints {
    public static void swapPoints(Point p1, Point p2) {
        int pointX = p1.x;
        int pointY = p1.y;
        p1.setLocation(p2.x, p2.y);
        p2.setLocation(pointX, pointY);
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");

    }
}
