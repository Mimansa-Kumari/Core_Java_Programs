import java.util.Random;
import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings1 = new SavingsAccount();

        System.out.println("1. Create an Online Account \n2. Explore Banking Services Of Coast SBI Bank");
        int choice = sc.nextInt();
        if (choice==1)
        {   System.out.println("Enter Your Name : ");
            savings1.accountHolderName=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter age : ");
            savings1.age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Account type (Savings/Current : ");
            savings1.accountType = sc.nextLine();
            System.out.println("Enter your address : ");
            savings1.address = sc.nextLine();
            System.out.println("Enter Phone Number : ");
            savings1.phoneNumber = sc.nextLong();
            savings1.accountNumber = ran.nextLong(100000000000L,999999999999L);
            SavingsAccount savings2 = new SavingsAccount(savings1.accountNumber, savings1.accountHolderName, savings1.accountBalance,
                    savings1.accountStatus, savings1.age, savings1.accountType, savings1.phoneNumber, savings1.address);

            savings2.createCustomerAccount(savings1.age,savings1.accountType,savings1.accountNumber);
            System.out.println();

            System.out.println("Customer Details : ");
            savings1.displayCustomerDetails(savings1.accountHolderName, savings1.age, savings1.accountType, savings1.address, savings1.phoneNumber, savings1.accountNumber);
            System.out.println("1. Deposit Cash \n2. Withdraw Cash \n3. Transfer Funds");
            System.out.println("Enter how many operation you want to perform : ");
            int operation=sc.nextInt();
            int i=1;
            while (i<=operation)
            {
                System.out.println("Select your choice : ");
                int option = sc.nextInt();
                System.out.println("Enter the Amount : ");
                double amount=sc.nextDouble();
                System.out.println("Enter your account number : ");
                long accNum=sc.nextLong();
                long partnerAccountNumber=0;
                if(option==3)
                {
                    System.out.println("Enter Account Number you want to transfer funds : ");
                    partnerAccountNumber= sc.nextLong();
                    savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                    i++;
                }
                else
                {
                    savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                    i++;
                }
            }
        }
        else if (choice==2)
        {
            System.out.println("1. Deposit Cash \n2. Withdraw Cash \n3. Transfer Funds");
            System.out.println("Enter how many operation you want to perform : ");
            int operation=sc.nextInt();
            int i=1;
            while (i<=operation)
            {
                System.out.println("Select your choice : ");
                int option = sc.nextInt();
                System.out.println("Enter the Amount : ");
                double amount=sc.nextDouble();
                System.out.println("Enter your account number : ");
                long accNum=sc.nextLong();
                long partnerAccountNumber=0;
                SavingsAccount savings2 = new SavingsAccount(savings1.accountNumber, savings1.accountHolderName, savings1.accountBalance,
                        savings1.accountStatus, savings1.age, savings1.accountType, savings1.phoneNumber, savings1.address);
                if(option==3)
                {
                    System.out.println("Enter Account Number you want to transfer funds : ");
                    partnerAccountNumber= sc.nextLong();
                    savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                    i++;
                }
                else
                {
                    savings2.customerServices(option, amount, accNum, partnerAccountNumber);
                    i++;
                }
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
