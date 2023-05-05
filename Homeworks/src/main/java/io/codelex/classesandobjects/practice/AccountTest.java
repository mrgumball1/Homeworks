package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Account.transfer;

public class AccountTest {
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
