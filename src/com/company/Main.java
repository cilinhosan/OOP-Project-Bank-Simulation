package com.company;

public class Main {

    public static void main(String[] args) {
        //Usage example

        Customer customerA = new Customer("CustomerAName");
        CheckingAccount CAcheckingAccount = new CheckingAccount(customerA);

        SavingsAccount CAsavingsAccount = new SavingsAccount(customerA);

        CAcheckingAccount.deposit(100.00);
        CAcheckingAccount.transfer(50.00, CAsavingsAccount);

        for (String information: CAcheckingAccount.getBankStatement()) {
            System.out.println(information);
        }

        for (String information: CAsavingsAccount.getBankStatement()) {
            System.out.println(information);
        }
    }
}
