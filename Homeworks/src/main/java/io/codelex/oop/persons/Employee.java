package io.codelex.oop.persons;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        int x = startedWorking.getYear();
        int y = LocalDate.now().getYear();
        int years = y - x;
        return years;
    }

    public String getPosition() {
        return position;
    }

    @Override
    String getInfo() {
        return
                getPosition() + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience()+ " years)";
    }
}