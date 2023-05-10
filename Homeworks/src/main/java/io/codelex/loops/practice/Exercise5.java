package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = in.nextLine().trim();
        System.out.print("Enter second word: ");
        String secondWord = in.nextLine().trim();
        String wholeString = firstWord.concat(secondWord);
        String dot = ".";
        String manyDots = "";

        for (int i = 0; i < (30 - wholeString.length()); i++) {
            manyDots += dot;

        }
        System.out.println(firstWord + manyDots + secondWord);
    }
}
