package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static int getNumber(char lowerCase) {
        int number = switch (lowerCase) {
            case 'a', 'b', 'c' -> 2;
            case 'd', 'e', 'f' -> 3;
            case 'g', 'h', 'i' -> 4;
            case 'j', 'k', 'l' -> 5;
            case 'm', 'n', 'o' -> 6;
            case 'p', 'q', 'r', 's' -> 7;
            case 't', 'u', 'v' -> 8;
            case 'w', 'x', 'y', 'z' -> 9;
            default -> -1;
        };
        return number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to turn in keypad: ");
        String value = in.nextLine();

        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetter(value.charAt(i)))
                System.out.print(getNumber(Character.toLowerCase(value
                        .charAt(i))));
            else
                System.out.print(value.charAt(i));
        }
    }
}
