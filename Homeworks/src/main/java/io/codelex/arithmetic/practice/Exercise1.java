package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");

        int x = input.nextInt();

        System.out.println("Enter second integer: ");

        int y = input.nextInt();

        System.out.println("Result: " + result(x, y));

    }
    public static boolean result(int z, int q) {
        return z == 15 || q == 15 || (z + q) == 15 || Math.abs(z - q) == 15;
        }


}
