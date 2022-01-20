package com.corejava;

public class BankAccount {

    private String owner;
    private int balance;

    public BankAccount(String owner)
    {
        balance = 0;
        this.owner = owner;
    }

    public BankAccount(String owner,int balance)
    {
        this.owner = owner;
        if(balance > 0)
            this.balance = balance;
        else
            System.err.println("Balance can't be negative");
    }

    public String getOwner()
    {
        return owner;
    }

    public int getBalance()
    {
        return balance;
    }

    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println(amount + " credited to your account");
            System.out.println("Current account balance is "+balance);
        }
        else
            System.err.println("Amount can't be negative");
    }

    public void withdraw(int amount)
    {
        if(amount>0)
            if(amount>balance)
                System.err.println("Insufficient balance to withdraw");
            else
                {
                balance -= amount;
                System.out.println("Your account debitted with Rs:"+amount);
                System.out.println("Current account balance is "+balance);
                }
         else
             System.err.println("It is not possible to withdraw given amount");
    }
}
