package io.codelex.classesandobjects.practice.Exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(06,30,1999);
        date1.displayDate();
        Date date2 = new Date(7,5,2022);
        date2.displayDate();
        date2.setDay(22);
        date2.displayDate();

    }
}
