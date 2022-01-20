package com.solidprinciples_violations;
import java.util.Scanner;
import java.sql.*;

public class Atm implements AtmMachine{

    protected Card card;
    protected double accountBalance;
    protected boolean isValidTransaction = false;

   Atm()
    {}

    Atm(Card card)
    {
        this.card = card;
        validateUser();
    }

    public void withdraw(int withdrawAmount)
    {
        if(isValidTransaction) {
            if (withdrawAmount < withdrawAmount) {
                withdrawAmount -= withdrawAmount;
                printTransactionReceipt(-withdrawAmount);
            } else {
                System.out.println("Insufficient funds to process the request");
                System.out.println("Your Current Account balance is " + withdrawAmount);
            }
        }

    }

    public void deposit(int depositAmount)
    {
            accountBalance += depositAmount;
            printTransactionReceipt(depositAmount);

    }

    public void checkBalance()
    {
        if(isValidTransaction)
            System.out.println("Your Current Account balance is " + accountBalance);

    }


    // Single responsibility principle violated i.e printing receipt service can be separated from this class
    // because this service and receipt format may be modified in future.

    public void printTransactionReceipt(int transactionAmount)
    {
        if(transactionAmount > 0)
            System.out.println("Your account is credited with Rs: "+transactionAmount);
        else
            System.out.println("Your account is debited with Rs: "+(-transactionAmount));
        System.out.println("Your Current Account balance is " + accountBalance);
    }


    // Dependency inversion principle violates as high-level code combined with low-level(database) code.
    // Open-Closed principle violated as using different database in future is easily extendable.

    public void validateUser()
    {
        System.out.println("Enter the security pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        int actualPin;
                try{

                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Password@123");

                    PreparedStatement stmt=con.prepareStatement("select atm_pin from users where card_id=?");

                    stmt.setInt(1,this.card.cardId);

                    ResultSet rs=stmt.executeQuery();

                    if(rs.next()) {
                        actualPin = rs.getInt(1);

                        if (actualPin == enteredPin)
                            this.isValidTransaction = true;
                        else
                            System.out.println("Remove your card and try with valid pin");
                    }

                    con.close();

                }catch(Exception e){ System.out.println(e);}

        }


    public static void main(String args[])
    {
        Card c = new Card(111);
        Atm a = new Atm(c);
        System.out.println(a.isValidTransaction);

    }

}
