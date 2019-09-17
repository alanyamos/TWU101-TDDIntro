package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int total;

    public Account(int total) {
        this.total = total;
    }

    public int deposit(int value) {
        total = total + value;
        return total;
    }

    public int withdraw(int value) throws NeededMoneyToCoverTheWithdrawalException {
        if (total < value) {
            throw new NeededMoneyToCoverTheWithdrawalException();
        }
        total = total - value;
        return total;
    }
}
