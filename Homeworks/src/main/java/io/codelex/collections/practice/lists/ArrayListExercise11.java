package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");

        //TODO: Add new value at 5th position
        arrayList.add(4,"new value on 5th position");
        System.out.println(arrayList);

        //TODO: Change value at last position (Calculate last position programmatically)
        int lastIndex = arrayList.size() - 1;
        arrayList.set(lastIndex, "change last element");
        System.out.println(arrayList);
        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);
        //TODO: Check if your list contains "Foobar" element
        if (arrayList.contains("Foobar")) {
            System.out.println("Contains");
        } else {
            System.out.println("Nope");
        }

        //TODO: Print each element of list using loop
        for (String element : arrayList) {
            System.out.println(element);
        }
    }

}
