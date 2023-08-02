package com.bankaccount;

import java.util.Random;
import java.util.Scanner;

public class RecurringDepositAccountImpl {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        String accountHolderName, accountType, address;
        int age;
        long phoneNumber, accountNumber;


        System.out.println("1. Enter 1 for Creating an Online Account");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Your Name : ");
            accountHolderName = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter age : ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Account type (Savings/Recurring: ");
            accountType = sc.nextLine();
            System.out.println("Enter your address : ");
            address = sc.nextLine();
            System.out.println("Enter Phone Number : ");
            phoneNumber = sc.nextLong();
            accountNumber = ran.nextLong(100000000000L, 999999999999L);


            RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount(accountNumber, "08/01/23", "joint", true, 0.0, 0.0, 5.5f, accountHolderName, "Active", age, accountType, phoneNumber, address);

            recurringDepositAccount.createCustomerAccount(accountNumber);
            System.out.println();

            System.out.println("Customer Details : ");
            recurringDepositAccount.displayCustomerDetails(accountType);
            System.out.println("Deposit Cash");
            System.out.println("Enter 1 for cash deposit : ");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter the Amount : ");
                double amount = sc.nextDouble();
                System.out.println("Enter your account number : ");
                long accNum = sc.nextLong();

                recurringDepositAccount.creditCash(amount,accNum);

                recurringDepositAccount.showAccountBalance();

                recurringDepositAccount.calculateInterest();
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
