package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                test = true;
            } if (i % 5 == 0) {
                System.out.print("Loza");
                test = true;
            } if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            } if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
