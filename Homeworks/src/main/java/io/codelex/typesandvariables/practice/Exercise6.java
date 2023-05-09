package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Input some digits");
            String num = input.nextLine();
            if (num.equals("done")) {
                break;
            } else if (num.length() != 1 || !Character.isDigit(num.charAt(0))) {
                System.out.println("invalid input");
            }else {
                sum += Integer.parseInt(num);
            }
        }
        System.out.println("The sum of digits " + sum);
    }
}
