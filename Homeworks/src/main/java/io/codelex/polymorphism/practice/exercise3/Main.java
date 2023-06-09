package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe",
                "In the middle of the nowhere", 47, "Janitor");
        emp1.display();

        Student stu1 = new Student("Jevgenijs", "Ostanins",
                "somewhere", 123, 4.5);
        stu1.display();
    }
}
