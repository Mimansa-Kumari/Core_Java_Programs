package com.jap.customexception;

import java.util.Scanner;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter


    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     *
     */
    public int  withdraw(int amount) throws InsufficientFundException{
        if(amount<getAccountBalance())
        {
            setAccountBalance(getAccountBalance()-amount);
        }
        else {
            throw new InsufficientFundException("Insufficient Account Balance ");
        }
        return getAccountBalance();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdraw amount : ");
        int amount = scanner.nextInt();
        Account account = new Account(5000);
        try {
            System.out.println("Total Balance : "+account.getAccountBalance());
            System.out.println("Amount after withdraw : "+account.withdraw(amount));
        }
        catch (InsufficientFundException exception)
        {
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
