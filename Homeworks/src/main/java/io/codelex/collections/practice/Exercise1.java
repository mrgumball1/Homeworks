package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrayList = new ArrayList<>();
        for (String element : array) {
            arrayList.add(element);
        }
        System.out.println("List: " + arrayList);

        //todo - replace array with a HashSet and print out the results
        Set<String> setList = new HashSet<>();
        for (String element : array) {
            setList.add(element);
        }
        System.out.println("HashSet: " + setList);


        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Germany");
        hashMap.put("BMW", "Germany");
        hashMap.put("Honda", "Japan");
        hashMap.put("Mercedes", "Germany");
        hashMap.put("VolksWagen", "Germany");
        hashMap.put("Mercedes", "Germany");
        hashMap.put("Tesla", "USA");
        System.out.println("HashMap: " + hashMap);

    }
}
