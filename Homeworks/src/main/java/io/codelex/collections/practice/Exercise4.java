package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            stringHashSet.add(name);
            if (name.equals("")){
                break;
            }

        }
        System.out.print("Unique name list contains: " + stringHashSet);
    }
}
