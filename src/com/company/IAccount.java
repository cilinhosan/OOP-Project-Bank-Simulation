package com.company;

import java.util.List;

public interface IAccount {
    int DEFAULT_AGENCY = 1;

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, Account targetAccount);

    List<String> getBankStatement();

    List<String> getAccountInformation();
}
