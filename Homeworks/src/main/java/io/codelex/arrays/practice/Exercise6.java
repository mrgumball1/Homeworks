package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] myArray1 = new int[10];
        int[] myArray2 = new int[myArray1.length];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < myArray1.length; i++) {
            myArray2[i] = myArray1[i];
        }
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[myArray1.length - 1] = -7;
            break;
        }
        System.out.println("Array 1: " + Arrays.toString(myArray1));
        System.out.println("Array 2: " + Arrays.toString(myArray2));
    }
}
