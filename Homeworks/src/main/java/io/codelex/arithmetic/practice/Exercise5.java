package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = (int) Math.floor(Math.random() * 100);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        int y = in.nextInt();
        if (x == y){
            System.out.println("You guessed it!  What are the odds?!?");
        } if (x > y) {
            System.out.println("Sorry, you are too low.  I was thinking of " + x);
        } if (x < y) {
            System.out.println("Sorry, you are too high.  I was thinking of " + x);
        }
    }
}
