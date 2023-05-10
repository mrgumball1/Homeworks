package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit from 1 till 7 ");

        int numOfDay = input.nextInt();
        if (numOfDay > 7 || numOfDay < 0) {
            System.out.println("Invalid input!!!");
        } else if (numOfDay == 1) {
            System.out.println("Monday");
        } else if (numOfDay == 2) {
            System.out.println("Tuesday");
        } else if (numOfDay == 3) {
            System.out.println("Wednesday");
        } else if (numOfDay == 4) {
            System.out.println("Thursday");
        } else if (numOfDay == 5) {
            System.out.println("Friday");
        } else if (numOfDay == 6) {
            System.out.println("Saturday");
        } else if (numOfDay == 7) {
            System.out.println("Sunday");
        }
    }
}
