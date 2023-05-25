package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2020, 12, 5);
        LocalDate secondDate = LocalDate.of(2020, 12, 25);
        int workingHours = workingHoursCalculator(firstDate, secondDate);
        System.out.println("Working hours: " + workingHours);

    }

    public static int workingHoursCalculator(LocalDate firstDate, LocalDate secondDate) {
        int workingHours = 0;
        LocalDate currentDate = firstDate;
        while (currentDate.isBefore(secondDate) || currentDate.isEqual(secondDate)) {
            if (isItWorkingDay(currentDate)) {
                workingHours += 8;
            }
            currentDate = currentDate.plusDays(1);
        }
        return workingHours;
    }

    private static boolean isItWorkingDay(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
}
