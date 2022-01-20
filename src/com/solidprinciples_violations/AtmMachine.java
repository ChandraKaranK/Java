package com.solidprinciples_violations;

public interface AtmMachine {

        void  validateUser();
        void withdraw(int withdrawAmount);
        void deposit(int depositAmount); // violating Interface Segregation principle as ATM's doesn't provide deposit service
        void checkBalance();
        void printTransactionReceipt(int transactionAmount);

}
