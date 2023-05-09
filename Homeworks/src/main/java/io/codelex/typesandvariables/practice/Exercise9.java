package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double time, kph, mph, mps;

        System.out.println("Enter distance in meters: ");
        double distance = inp.nextDouble();

        System.out.println("Enter hours: ");
        double hours = inp.nextDouble();

        System.out.println("Enter minutes: ");
        double minutes = inp.nextDouble();

        System.out.println("Enter seconds: ");
        double seconds = inp.nextDouble();

        time = (hours * 3600) + (minutes * 60) + seconds;
        mps = distance / time;
        kph = (distance / 1000.0) / (time / 3600.0);
        mph = kph / 1.609;

        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);
        inp.close();
    }
}
