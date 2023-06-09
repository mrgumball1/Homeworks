package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person{
    private double gpa;
    public Student(String firstName, String lastName,
                   String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    void display() {
        System.out.println(toString());
    }
}
