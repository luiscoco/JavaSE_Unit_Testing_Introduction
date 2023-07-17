package com.timbuchalka;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private BankAccount bankAccount;

    @Before
    public void setup() {
        bankAccount = new BankAccount("John", "Doe", 1000.0);
    }

    @Test
    public void deposit() {
        double depositAmount = 500.0;
        boolean isBranch = true;
        double newBalance = bankAccount.deposit(depositAmount, isBranch);
        Assert.assertEquals(1500.0, newBalance, 0.0);
    }

    @Test
    public void withdrawSufficientFunds() {
        double withdrawalAmount = 300.0;
        boolean isBranch = true;
        double newBalance = bankAccount.withdraw(withdrawalAmount, isBranch);
        Assert.assertEquals(700.0, newBalance, 0.0);
    }

    @Test
    public void withdrawInsufficientFunds() {
        double withdrawalAmount = 2000.0;
        boolean isBranch = true;
        double newBalance = bankAccount.withdraw(withdrawalAmount, isBranch);
        Assert.assertEquals(-1000.0, newBalance, 0.0);
    }

    @Test
    public void getBalance() {
        double balance = bankAccount.getBalance();
        Assert.assertEquals(1000.0, balance, 0.0);
    }
}
