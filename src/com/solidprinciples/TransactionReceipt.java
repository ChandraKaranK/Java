package com.solidprinciples;

public class TransactionReceipt {

    private final double accountBalance;

    TransactionReceipt(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public void printTransactionReceipt(int transactionAmount)
    {
        if(transactionAmount > 0)
            System.out.println("Your account is credited with Rs: "+transactionAmount);
        else
            System.out.println("Your account is debited with Rs: "+(-transactionAmount));
        System.out.println("Your Current Account balance is " + accountBalance);
    }

}
