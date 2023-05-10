package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        int min, max;

        if (num1 >= num2)
            if (num1 >= num3) {
                max = num1;
                if (num2 >= num3) min = num3;
                else min = num2;
            } else {
                max = num3;
                min = num2;
            }
        else if (num2 >= num3) {
            max = num2;
            if (num1 >= num3) min = num3;
            else min = num1;
        } else {
            max = num3;
            if (num1 >= num2) min = num2;
            else min = num1;
        }


        System.out.println("Largest number is: " + max);
        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }

}
