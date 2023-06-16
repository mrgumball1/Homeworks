package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int cardNumber, String fullName, int ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    void deposit(BigDecimal amount) throws NotEnoghtFundsException {
        super.setBalance(getBalance().add(amount));
        if (getBalance().compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    void withdraw(BigDecimal amount) throws NotEnoghtFundsException {
        if ((getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0)) {
            throw new NotEnoghtFundsException("Error: not enough funds!!!");
        } else {
            super.setBalance(getBalance().subtract(amount));
        }
    }
}
