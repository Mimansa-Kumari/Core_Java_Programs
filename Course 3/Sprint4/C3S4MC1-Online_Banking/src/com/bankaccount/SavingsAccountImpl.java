package com.bankaccount;

import java.util.Random;
import java.util.Scanner;

    public class SavingsAccountImpl {
        public static void main(String[] args) {
            Random ran = new Random();
            Scanner sc = new Scanner(System.in);

            String accountHolderName, accountType, address;
            int age;
            long phoneNumber, accountNumber;


            System.out.println("1. Create an Online Account \n2. Explore Banking Services Of Coast SBI Bank");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Your Name : ");
                accountHolderName = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter age : ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Account type (Savings/Current : ");
                accountType = sc.nextLine();
                System.out.println("Enter your address : ");
                address = sc.nextLine();
                System.out.println("Enter Phone Number : ");
                phoneNumber = sc.nextLong();
                accountNumber = ran.nextLong(100000000000L, 999999999999L);


                SavingsAccount savings1 = new SavingsAccount(accountNumber, "08/01/23", "joint", true, 0.0, 0.0, 5.5f, accountHolderName, "Active", age, accountType, phoneNumber, address);

                savings1.createCustomerAccount( accountNumber);
                System.out.println();

                System.out.println("Customer Details : ");
                savings1.displayCustomerDetails(accountType);
                System.out.println("1. Deposit Cash \n2. Withdraw Cash \n3. Transfer Funds");
                System.out.println("Enter how many operation you want to perform : ");
                int operation = sc.nextInt();
                int i = 1;
                while (i <= operation) {
                    System.out.println("Select your choice : ");
                    int option = sc.nextInt();
                    System.out.println("Enter the Amount : ");
                    double amount = sc.nextDouble();
                    System.out.println("Enter your account number : ");
                    long accNum = sc.nextLong();
                    long partnerAccountNumber = 0;
                    if (option == 3) {
                        System.out.println("Enter Account Number you want to transfer funds : ");
                        partnerAccountNumber = sc.nextLong();
                        savings1.customerServices(option, amount, accNum, partnerAccountNumber);
                        i++;
                    } else {
                        savings1.customerServices(option, amount, accNum, partnerAccountNumber);
                        i++;
                    }
                }
            } else if (choice == 2) {
                System.out.println("Enter Your Name : ");
                accountHolderName = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter age : ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Account type (Savings/Current : ");
                accountType = sc.nextLine();
                System.out.println("Enter your address : ");
                address = sc.nextLine();
                System.out.println("Enter Phone Number : ");
                phoneNumber = sc.nextLong();
                accountNumber = ran.nextLong(100000000000L, 999999999999L);
                System.out.println("1. Deposit Cash \n2. Withdraw Cash \n3. Transfer Funds");
                System.out.println("Enter how many operation you want to perform : ");
                int operation = sc.nextInt();
                int i = 1;
                while (i <= operation) {
                    System.out.println("Select your choice : ");
                    int option = sc.nextInt();
                    System.out.println("Enter the Amount : ");
                    double amount = sc.nextDouble();
                    System.out.println("Enter your account number : ");
                    long accNum = sc.nextLong();
                    long partnerAccountNumber = 0;
                    SavingsAccount savings2 = new SavingsAccount(accountNumber, "08/01/23", "joint", true, 0.0, 0.0, 5.5f, accountHolderName, "Active", age, accountType, phoneNumber, address);
                    if (option == 3) {
                        System.out.println("Enter Account Number you want to transfer funds : ");
                        partnerAccountNumber = sc.nextLong();
                        savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                        i++;
                    } else {
                        savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                        i++;
                    }
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }
