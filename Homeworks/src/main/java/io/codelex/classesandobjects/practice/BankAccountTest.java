package io.codelex.classesandobjects.practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bensen = new BankAccount("Benson", 17.25);
        BankAccount minusBensen = new BankAccount("Benson", -17.50);
        System.out.println(bensen.toString());
        System.out.println(bensen.toString2());
        System.out.println(minusBensen.toString2());
        System.out.println(minusBensen.toString());
    }
}
