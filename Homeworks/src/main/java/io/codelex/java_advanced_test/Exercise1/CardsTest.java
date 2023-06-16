package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public class CardsTest {
    public static void main(String[] args) throws NotEnoghtFundsException {
        CreditCard creditCard = new CreditCard(1112222333, "John Doe",969 , BigDecimal.valueOf(3000));
        DebitCard debitCard = new DebitCard(1112223335, "Mister Smith", 769, BigDecimal.valueOf(1500));
        System.out.println(creditCard.getBalance());
        System.out.println(debitCard.getBalance());
        creditCard.deposit(BigDecimal.valueOf(1500.35));
        debitCard.deposit(BigDecimal.valueOf(10000));
        System.out.println(creditCard.getBalance());
        System.out.println(debitCard.getBalance());
        creditCard.withdraw(BigDecimal.valueOf(15.35));
        debitCard.withdraw(BigDecimal.valueOf(70000));
        System.out.println(creditCard.getBalance());
        System.out.println(debitCard.getBalance());

    }
}
