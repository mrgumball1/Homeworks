package io.codelex.loops.practice;

public class AsciiFigure {
    public static final int rows = 7;
    public static void main(String[] args) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= i * 8 - 8; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (rows - i) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
