package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER INTEGER: ");
        int inputToCheck = scanner.nextInt();
        if (checkDoesIntegerIsHappy(inputToCheck)) {
            System.out.println("Its a Happy number");
        }else {
            System.out.println("Its not a Happy number");
        }


    }
    public static boolean checkDoesIntegerIsHappy(int number){
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            number = numSquareSum(number);
            if (number == 1)
                return true;
            if (st.contains(number))
                return false;
            st.add(number);
        }
    }
    static int numSquareSum(int number)
    {
        int squareSum = 0;
        while (number!= 0)
        {
            squareSum += (number % 10) * (number % 10);
            number /= 10;
        }
        return squareSum;
    }
}
