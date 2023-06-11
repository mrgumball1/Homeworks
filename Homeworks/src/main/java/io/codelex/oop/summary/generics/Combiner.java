package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <T, U> String combineTwoItems(T first, U second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(10);
        String string = "Some text";

        System.out.println(combineTwoItems(string, decimal));
    }
}
