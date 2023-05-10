package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int roll = 0;
        boolean play = true;
        System.out.println("Welcome to Piglet!!!");

        while (play) {
            roll = (int) (Math.random() * 6) + 1;
            if (roll == 1) {
                System.out.println("You rolled a 1!");
                play = false;
            } else {
                result += roll;
                System.out.println("You rolled a " + roll);
                System.out.println("You got " + result + " points");
                System.out.println("Roll again? ");
                String in = scanner.nextLine();
                if (!in.equalsIgnoreCase("y")) {
                    play = false;
                    System.out.println("You got " + result + " points");
                }
            }
        }
    }
}
