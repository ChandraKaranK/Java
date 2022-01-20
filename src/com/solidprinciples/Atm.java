package com.solidprinciples;

import com.solidprinciples.validator.CardValidator;
import com.solidprinciples.validator.MysqlValidator;

public class Atm implements AtmMachine {

    protected Card card;
    protected TransactionReceipt receipt;
    protected double accountBalance;
    protected boolean isValidTransaction = false;

    Atm()
    {}

    Atm(Card card)
    {
        this.card = card;
        CardValidator cv = new MysqlValidator();
        isValidTransaction=cv.validateUser(this.card.cardId);
        receipt = new TransactionReceipt(accountBalance);

    }

    public void withdraw(int withdrawAmount)
    {
        if(isValidTransaction) {
            if (withdrawAmount < accountBalance) {
                accountBalance -= withdrawAmount;
                receipt.printTransactionReceipt(-withdrawAmount);
            } else {
                System.out.println("Insufficient funds to process the request");
                System.out.println("Your Current Account balance is " + accountBalance);
            }
        }

    }

    public void deposit(int depositAmount)
    {
        accountBalance += depositAmount;
        receipt.printTransactionReceipt(depositAmount);

    }

    public void checkBalance()
    {
        if(isValidTransaction)
            System.out.println("Your Current Account balance is " + accountBalance);

    }


    public static void main(String[] chandra)
    {
        Card c = new Card(111);
        Atm a = new Atm(c);

    }
}
