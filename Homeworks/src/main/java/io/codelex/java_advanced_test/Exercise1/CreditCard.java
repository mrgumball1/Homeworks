package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int cardNumber, String fullName, int ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    void deposit(BigDecimal amount) throws NotEnoghtFundsException {
        super.setBalance(getBalance().add(amount));
    }

    @Override
    void withdraw(BigDecimal amount) throws NotEnoghtFundsException {
        if ((getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0)){
            throw new NotEnoghtFundsException("Error: not enough funds!!! ");
        } else{
            super.setBalance(getBalance().subtract(amount));
            if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
                System.out.println("Warning: Low funds!!");
            }
        }
    }
}
