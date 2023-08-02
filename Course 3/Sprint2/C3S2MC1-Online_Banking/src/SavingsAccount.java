
public class SavingsAccount {
    public long accountNumber;
    public String accountHolderName;
    public double accountBalance;
    public String accountStatus;
    public int age;
    String accountType;
    long phoneNumber;
    String address;


    public SavingsAccount()
    {
        this.accountNumber=0;
        this.accountHolderName=null;
        this.accountBalance=0.0;
        this.accountStatus=null;
        this.age=0;
        this.accountType=null;
        this.phoneNumber=0;
        this.address=null;
    }


    public SavingsAccount(long accountNumber,String accountHolderName, double accountBalance, String accountStatus, int age, String accountType, long phoneNumber, String address)
    {
        this.accountNumber= accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
        this.accountStatus=accountStatus;
        this.age=age;
        this.accountType=accountType;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }

    public void createCustomerAccount(int age, String accountType, long accountNumber)
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
    void displayCustomerDetails(String accountHolderName,int age,String accType,String address,long phoneNumber,long accountNumber)
    {
        System.out.println("Account Holder's Name : "+accountHolderName);
        System.out.println("Account Holder's Age : "+age);
        System.out.println("Account Type : "+accType);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Account Number : "+accountNumber);
    }
    public void creditCash(double amount, long accountNumber)
    {
        if (accountNumber==this.accountNumber)
        {
            System.out.println("Your account has been credited with Rs. "+amount);
            this.accountBalance+=amount;
        }
        else
        {
            System.out.println("Incorrect Account Number! \nCreate a new Account!");
        }
    }
    public void debitCash(double amount, long accountNumber)
    {
        if (accountNumber==this.accountNumber)
        {
            if (this.accountBalance>=amount)
            {
                System.out.println("Rs. "+amount+" has been debited from your account");
                this.accountBalance=this.accountBalance-amount;
                System.out.println("Your current Balance : "+this.accountBalance);
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
        if (this.accountBalance>=amount)
        {
            System.out.println("Rs. "+amount+" has been successfully transferred");
            System.out.println("Your account has been debited by Rs. "+amount);
            this.accountBalance=this.accountBalance-amount;
            System.out.println("Your current Balance : "+this.accountBalance);
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
}
