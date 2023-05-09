package io.codelex.arithmetic.practice;



public class Product1ToN {
    public static void main(String[] args) {
        int n = 10;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        System.out.println("Factorial " + n + " is " + number);
    }
}
