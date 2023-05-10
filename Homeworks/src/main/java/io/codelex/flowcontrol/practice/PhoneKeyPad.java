package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static int getNumber(char lowerCase) {
        int number = 0;
        switch (lowerCase) {
            case 'a':
            case 'b':
            case 'c':
                number = 2;
                break;
            case 'd':
            case 'e':
            case 'f':
                number = 3;
                break;
            case 'g':
            case 'h':
            case 'i':
                number = 4;
                break;
            case 'j':
            case 'k':
            case 'l':
                number = 5;
                break;
            case 'm':
            case 'n':
            case 'o':
                number = 6;
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                number = 7;
                break;
            case 't':
            case 'u':
            case 'v':
                number = 8;
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                number = 9;
        }
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
