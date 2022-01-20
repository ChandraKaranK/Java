package com.solidprinciples_violations;

public class NonDepositableAtm extends Atm {

    // Liskov Substitution principle violated as 'Withdraw_Only-Atm' is not a perfect substitute of 'Atm' class
    @Override
    public void deposit(int depositAmount)
    {
        System.out.println("Deposit service is currently unavailable in this ATM");
    }

}
