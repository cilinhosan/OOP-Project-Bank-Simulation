package com.company;

import java.util.ArrayList;
import java.util.List;


public abstract class Account implements IAccount {
    static int SEQUENTIAL = 1;

    private Customer accountBeneficiary;
    protected int agency;
    protected int accountNumber;
    protected double balance;

    public Account(Customer customer){
        this.agency = IAccount.DEFAULT_AGENCY;
        this.accountNumber = Account.SEQUENTIAL++;
        this.accountBeneficiary = customer;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account targetAccount) {
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    @Override
    public List<String> getAccountInformation() {
        List<String> accountInformation = new ArrayList<>();

        accountInformation.add(getAccountBeneficiary().getName());
        accountInformation.add(Integer.toString(getAgency()));
        accountInformation.add(Integer.toString(getAccountNumber()));
        accountInformation.add(String.format("%.2f", getBalance()));

        return accountInformation;
    }

    public Customer getAccountBeneficiary() {
        return accountBeneficiary;
    }

    public void setAccountBeneficiary(Customer accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
