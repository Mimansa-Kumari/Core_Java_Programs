package com.bankaccount;

public abstract class BankAccount {
public long accountNumber;
public String accountOpeningDate;
public String modeOfOperation;
public boolean isOnline;
public double totalBalance;
public double availableBalance;
public float interestRate;


    public BankAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean isOnline, double totalBalance, double availableBalance, float interestRate) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.isOnline = isOnline;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.interestRate = interestRate;
    }

    abstract void showAccountBalance();
}
