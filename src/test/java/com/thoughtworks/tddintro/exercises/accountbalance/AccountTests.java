package com.thoughtworks.tddintro.exercises.accountbalance;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        int expected = account.deposit(50);
        assertThat(expected, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() throws NeededMoneyToCoverTheWithdrawalException {
        Account account = new Account(100);
        int expected = account.withdraw(50);
        assertThat(expected, is(50));
    }

    @Test(expected = NeededMoneyToCoverTheWithdrawalException.class)
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() throws NeededMoneyToCoverTheWithdrawalException {
        Account account = new Account(50);
        account.withdraw(100);
    }
}
