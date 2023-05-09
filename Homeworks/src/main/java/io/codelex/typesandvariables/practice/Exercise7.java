package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int uppercase = 0;

            System.out.println("Enter text we will count Uppercase");
            String input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a >= 'A' && a <= 'Z')
                uppercase++;
            }
        System.out.println("Uppercase letters " + uppercase);
        }
    }

