package com.bankaccount;
public class RecurringDepositAccount extends BankAccount {

    public String accountHolderName;
    public String accountStatus;
    public int age;
    public String accountType;
    public long phoneNumber;
    public String address;


    public RecurringDepositAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean isOnline, double totalBalance, double availableBalance, float interestRate, String accountHolderName, String accountStatus, int age, String accountType, long phoneNumber, String address) {
        super(accountNumber, accountOpeningDate, modeOfOperation, isOnline, totalBalance, availableBalance, interestRate);
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.age = age;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void createCustomerAccount(long accountNumber)
    {
        if (age>=18) {
            if (accountType.equalsIgnoreCase("Recurring")) {
                System.out.println("Congratulations!\nYour account has been successfully Created.");
                System.out.println("Your account number : "+accountNumber);
            }
            else {
                System.out.println("Sorry you are not eligible!,\nOnly Recurring Deposit Account can be create");
            }
        }
        else
        {
            System.out.println("Sorry you are not eligible!, Age must be 18 or above.");
        }
    }
    void displayCustomerDetails(String accType)
    {
        System.out.println("Account Holder's Name : "+accountHolderName);
        System.out.println("Account Holder's Age : "+age);
        System.out.println("Account Type : "+accType);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Account Number : "+super.accountNumber);

    }
    public void creditCash(double amount, long accountNumber) {
        if (accountNumber == super.accountNumber) {
            System.out.println("Your account has been credited with Rs. " + amount);
            super.totalBalance += amount;
        } else {
            System.out.println("Incorrect Account Number! \nCreate a new Account!");
        }
    }

    public void showAccountBalance()
    {
        System.out.println("Total Balance = "+super.totalBalance);
    }

    public void calculateInterest()
    {
        double totalAmountAfterInterest = super.totalBalance*(super.interestRate/100)+super.totalBalance;
        System.out.println("You will get Rs. "+totalAmountAfterInterest+" after 1 year by adding 5.5% interest amount");
    }
}