package io.codelex.classesandobjects.practice.Exercise8;

import java.text.NumberFormat;
import java.util.Scanner;

public class SavingsAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double startBalance, double interestRate) {
        this.balance = startBalance;
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void addToMonthlyBalance() {
        double monthlyInterestRate = interestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }
    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("How much money is in the account?: ");
        double initialBalance = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("How long has the account been opened? ");
        int months = input.nextInt();

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalInterestEarned = 0;

        SavingsAccount account = new SavingsAccount(initialBalance, annualInterestRate);

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposit = input.nextDouble();
            account.deposit(deposit);
            totalDeposits += deposit;

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawal = input.nextDouble();
            account.withdraw(withdrawal);
            totalWithdrawals += withdrawal;

            account.addToMonthlyBalance();
            totalInterestEarned += account.checkBalance() - (totalDeposits - totalWithdrawals);
        }

        System.out.println("Total deposited: " + currency.format(totalDeposits));
        System.out.println("Total withdrawn: " + currency.format(totalWithdrawals));
        System.out.println("Interest earned: " + currency.format(totalInterestEarned));
        System.out.println("Ending balance: " + currency.format(account.checkBalance()));
    }

}
