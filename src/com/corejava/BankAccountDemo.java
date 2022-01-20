package com.corejava;

public class BankAccountDemo {

    public static void main(String []args)
    {
        BankAccount acc = new BankAccount("chandra",1000);
        acc.deposit(100);
        acc.withdraw(50);
    }

}
