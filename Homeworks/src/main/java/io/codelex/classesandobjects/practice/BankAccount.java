package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return name + ", " + currency.format(balance);
    }


    public String toString2() {
        DecimalFormat format = new DecimalFormat("0.00");
        String formatBalance = format.format(Math.abs(balance));
        String minusSign = (balance < 0) ? "-" : "";
        return name + ", " + minusSign + "$" + formatBalance;
    }

    public static void main(String[] args) {
        BankAccount bensen = new BankAccount("Benson", 17.25);
        BankAccount minusBensen = new BankAccount("Benson", -17.50);
        System.out.println(bensen.toString());
        System.out.println(bensen.toString2());
        System.out.println(minusBensen.toString2());
        System.out.println(minusBensen.toString());
    }
}
