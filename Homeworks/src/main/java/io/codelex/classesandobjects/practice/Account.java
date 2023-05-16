package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.balance -= howMuch;
        to.balance += howMuch;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account("Billy", 100.0);
        account1.deposit(20.0);
        System.out.println(account1.toString());
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattAccount.toString());
        System.out.println(myAccount.toString());
        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0);
        Account accountC = new Account("C", 0);
        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);
        System.out.println(accountA.toString());
        System.out.println(accountB.toString());
        System.out.println(accountC.toString());
    }
}
