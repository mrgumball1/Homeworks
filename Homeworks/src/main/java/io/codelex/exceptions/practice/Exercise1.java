package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the numerator or enter q to quit");
                int numerator = Integer.parseInt(scanner.next());
                System.out.println("Enter the divisor or enter q to quit");
                int divisor = Integer.parseInt(scanner.next());
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Cant divide by 0 ");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("INPUT NUMBERS");
                if (scanner.next().matches("[q]")) {
                    break;
                }

            }
        }
    }
}