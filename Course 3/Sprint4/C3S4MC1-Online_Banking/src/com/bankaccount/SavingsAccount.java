package com.bankaccount;

public class SavingsAccount extends BankAccount {
        public String accountHolderName;
        public String accountStatus;
        public int age;
        public String accountType;
        public long phoneNumber;
        public String address;


    public SavingsAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean isOnline, double totalBalance, double availableBalance, float interestRate, String accountHolderName, String accountStatus, int age, String accountType, long phoneNumber, String address) {
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
                if (accountType.equalsIgnoreCase("savings")) {
                    System.out.println("Congratulations!\nYour account has been successfully Created.");
                    System.out.println("Your account number : "+accountNumber);
                }
                else {
                    System.out.println("Sorry you are not eligible!,\nOnly Savings account can be create online");
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
        public void creditCash(double amount, long accountNumber)
        {
            if (accountNumber==super.accountNumber)
            {
                System.out.println("Your account has been credited with Rs. "+amount);
                super.totalBalance+=amount;
            }
            else
            {
                System.out.println("Incorrect Account Number! \nCreate a new Account!");
            }
        }
        public void debitCash(double amount, long accountNumber)
        {
            if (accountNumber==super.accountNumber)
            {
                if (totalBalance>=amount)
                {
                    System.out.println("Rs. "+amount+" has been debited from your account");
                    super.totalBalance=super.totalBalance-amount;
                    System.out.println("Your current Balance : "+super.totalBalance);
                }
                else
                {
                    System.out.println("Insufficient Balance! \nAdd Money to your Account");
                }
            }
            else
            {
                System.out.println("Incorrect Account Number! \nCreate a new Account!");
            }
        }
        public void fundTransfer(double amount, long accountNumber, long partnerAccountNumber)
        {
            if (super.totalBalance>=amount)
            {
                System.out.println("Rs. "+amount+" has been successfully transferred");
                System.out.println("Your account has been debited by Rs. "+amount);
                super.totalBalance=super.totalBalance-amount;
                System.out.println("Your current Balance : "+super.totalBalance);
            }
            else
            {
                System.out.println("Insufficient Balance! \nAdd Money to your Account");
            }
        }
        public void customerServices(int option,double amount, long accountNumber, long partnerAccountNumber)
        {
            switch (option)
            {
                case 1:
                    creditCash(amount, accountNumber);
                    break;
                case 2:
                    debitCash(amount, accountNumber);
                    break;
                case 3:
                    fundTransfer(amount, accountNumber, partnerAccountNumber);
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
        public void bankingServices(int option, double amount, long accountNumber, long partnerAccountNumber)
        {
            switch (option)
            {
                case 1:
                    creditCash(amount, accountNumber);
                    break;
                case 2:
                    debitCash(amount, accountNumber);
                    break;
                case 3:
                    fundTransfer(amount, accountNumber, partnerAccountNumber);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        public void showAccountBalance()
        {
            System.out.println("Total account balance : "+super.totalBalance);
        }
    }
