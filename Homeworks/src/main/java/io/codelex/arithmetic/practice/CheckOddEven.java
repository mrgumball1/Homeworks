package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter odd or even number we will check it: ");
        int oddOrEven = in.nextInt();

        if (oddOrEven % 2 == 0){
            System.out.println("Its even");
        }else {
            System.out.println("Its odd");
        }
    }
}
