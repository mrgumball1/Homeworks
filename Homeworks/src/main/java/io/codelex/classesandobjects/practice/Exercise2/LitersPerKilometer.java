package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main( String[] args )  {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;
        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

    }
}