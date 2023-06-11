package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Printer<T> {

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public static void main(String[] args) {
        Printer<String> printer1 = new Printer<>("some text");
        Printer<Integer> printer2 = new Printer<>(10);
        Printer<BigDecimal> printer3 = new Printer<>(new BigDecimal("10.34"));

        printer1.print();
        printer2.print();
        printer3.print();

    }
}
