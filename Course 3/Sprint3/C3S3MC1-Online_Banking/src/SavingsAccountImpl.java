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
        {   sc.nextLine();
            System.out.println("Enter Your Name : ");
            savings1.setAccountHolderName(sc.nextLine());
            System.out.println("Enter age : ");
            savings1.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter Account type (Savings/Current : ");
            savings1.setAccountType(sc.nextLine());
            System.out.println("Enter your address : ");
            savings1.setAddress(sc.nextLine());
            System.out.println("Enter Phone Number : ");
            savings1.setPhoneNumber(sc.nextLong());
            savings1.setAccountNumber(ran.nextLong(100000000000L,999999999999L));
            savings1.setTotalBalance(0.0);
            savings1.setAccountStatus("Active");
            savings1.setAccountOpeningDate("05/01/2023");
            savings1.setAvailableBalance(0.0);
            sc.nextLine();
            System.out.println("Select mode of Operation : \n1.Self Operated\n2.Joint Account");
            savings1.setModeOfOperation(sc.nextLine());
            savings1.setInterestRate(5.0);
            savings1.setBankingMode("Online");

            System.out.println();
            savings1.createCustomerAccount();
            System.out.println();

            System.out.println();
            System.out.println("Customer Details : ");
            savings1.displayCustomerDetails();

            System.out.println();
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
                    savings1.customerServices(option, amount, partnerAccountNumber,accNum);
                    i++;
                }
                else
                {
                    savings1.customerServices(option, amount, partnerAccountNumber,accNum);
                    i++;
                }
            }
            System.out.println("\n");
            System.out.println("Account Details : ");
            savings1.displayAccountDetails();
        }
        else if (choice==2)
        {
            System.out.println();
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
                    savings1.customerServices(option, amount, partnerAccountNumber,accNum);
                    i++;
                }
                else
                {
                savings1.customerServices(option, amount, partnerAccountNumber,accNum);
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
