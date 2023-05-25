package io.codelex.dateandtime.practice;

import java.time.LocalDate;


public class Exercise2 {
    public static void main(String[] args) {
        LocalDate launchDate = LocalDate.of(2023, 2, 23);
        LocalDate nextUpdate = LocalDate.of(2023, 9, 23);
        calculateUpdateDate(launchDate, nextUpdate);
    }

    public static void calculateUpdateDate(LocalDate startDate, LocalDate endDate) {
        LocalDate updateDate = startDate;
        while (updateDate.isBefore(endDate) || updateDate.isEqual(endDate)) {
            updateDate = updateDate.plusWeeks(2);
            if (updateDate.getMonth().equals(endDate.getMonth())) {
                System.out.println(updateDate);
            }
        }

    }
}
