package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        int desiredSum;

        Scanner in = new Scanner(System.in);
        System.out.print("What number you want get from 2 dices ");
        desiredSum = in.nextInt();
        int summa = 0;
        while (desiredSum != summa) {
            int firstDice = (int) (Math.random() * 5) + 1;
            int secondDice = (int) (Math.random() * 5) + 1;
            summa = (firstDice + secondDice);
            System.out.println(firstDice + " and " + secondDice + " = " + summa);
        }
    }
}
