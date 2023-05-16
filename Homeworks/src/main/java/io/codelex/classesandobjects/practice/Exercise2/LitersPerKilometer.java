package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main( String[] args )  {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

//       // Car car = new Car(startKilometers, endKilometers, liters);
//
//        //Car car2 = new Car(100, 235, 50);
//
//        System.out.println( "Kilometers per liter are "  + car.calculateConsumption());
//        System.out.println( "Kilometers per liter are "  + car2.calculateConsumption());

    }
}