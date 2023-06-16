package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    int cardNumber;
    String fullName;
    int ccvCode;
    BigDecimal balance;

    public Card(int cardNumber, String fullName, int ccvCode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    abstract void deposit(BigDecimal amount) throws NotEnoghtFundsException;

    abstract void withdraw(BigDecimal amount) throws NotEnoghtFundsException;
}

