package io.codelex.oop.persons;


import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "Jonh",
                "Deer",
                "dkauygdk",
                36,
                "SpecialOps", LocalDate.of(2020, 3, 30));
        System.out.println(employee.getInfo());
        Customer customer = new Customer(
                "Lupa",
                "Pupa",
                "id",
                19,
                "CUS1",
                0);
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(10);
        System.out.println(customer.getInfo());

    }
}
