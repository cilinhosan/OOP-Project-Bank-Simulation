package com.company;

import java.util.List;

public class CheckingAccount extends Account {
    private final String accountType = "CheckingAccount";

    public CheckingAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value);
    }

    @Override
    public void deposit(double value) {
        super.deposit(value);
    }

    @Override
    public void transfer(double value, Account targetAccount) {
        super.transfer(value, targetAccount);
    }

    @Override
    public List<String> getBankStatement() {
        List<String> accountInformation = super.getAccountInformation();
        accountInformation.add(this.getAccountType());

        return accountInformation;
    }

    private String getAccountType() {
        return this.accountType;
    }
}
