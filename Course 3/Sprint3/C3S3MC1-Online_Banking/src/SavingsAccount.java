
public class SavingsAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private String bankingMode;
    private double interestRate;
    private String modeOfOperation;
    private int age;
    private String accountType;
    private long phoneNumber;
    private String address;

//    //___________________________________________________________________starting setter______________________________________________________________________
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setBankingMode(String bankingMode) {
        this.bankingMode = bankingMode;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  //___________________________________________________________________starting getter______________________________________________________________________


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public String getBankingMode() {
        return bankingMode;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public int getAge() {
        return age;
    }

    public String getAccountType() {
        return accountType;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    //___________________________________________________________________creating customer account______________________________________________________________________
    public void createCustomerAccount()
    {
        if (getAge()>=18)
        {
            if (getAccountType().equalsIgnoreCase("savings")) {
                System.out.println("Congratulations!\nYour account has been successfully Created.");
                System.out.println("Your account number : "+getAccountNumber());
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

    //___________________________________________________________________displaying customer details______________________________________________________________________
    public void displayCustomerDetails() {
        System.out.println("Account Holder's Name : " +getAccountHolderName());
        System.out.println("Account Holder's Age : " +getAge());
        System.out.println("Account Type : " +getAccountType());
        System.out.println("Address : " +getAddress());
        System.out.println("Phone Number : " +getPhoneNumber());
        System.out.println("Account Number : " +getAccountNumber());
    }
    //___________________________________________________________________displaying account details______________________________________________________________________
    public void displayAccountDetails()
    {
        System.out.println("Account Holder's Name : " +getAccountHolderName());
        System.out.println("Account Type : " +getAccountType());
        System.out.println("Account Number : " +getAccountNumber());
        System.out.println("Account Status : "+getAccountStatus());
        System.out.println("Banking Mode : "+getBankingMode());
        System.out.println("Interest Rate : "+getInterestRate());
        System.out.println("Mode of Operation : "+getModeOfOperation());
        System.out.println("Account Opening Date : "+getAccountOpeningDate());
        System.out.println("Available Balance : "+getTotalBalance());
        System.out.println("Total Balance : "+getTotalBalance());
    }
    public void creditCash(long accNumber,double amount)
    {
        if (accNumber==getAccountNumber())
        {
            System.out.println("Your account has been credited with Rs. "+amount);
            setTotalBalance(getTotalBalance()+amount);
        }
        else
        {
            System.out.println("Incorrect Account Number! \nCreate a new Account!");
        }
    }
    public void debitCash(long accNumber, double amount)
    {
        if (accNumber==getAccountNumber())
        {
            if (getTotalBalance()>=amount)
            {
                System.out.println("Rs. "+amount+" has been debited from your account");
                setTotalBalance(getTotalBalance()-amount);
                System.out.println("Your current Balance : "+getTotalBalance());
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
    public void fundTransfer(double amount, long partnerAccountNumber)
    {
        if (getTotalBalance()>=amount)
        {
            System.out.println("Rs. "+amount+" has been successfully transferred");
            System.out.println("Your account has been debited by Rs. "+amount);
            setTotalBalance(getTotalBalance()-amount);
            System.out.println("Your current Balance : "+getTotalBalance());
        }
        else
        {
            System.out.println("Insufficient Balance! \nAdd Money to your Account");
        }
    }
    public void customerServices(int option,double amount, long partnerAccountNumber,long accountNumber)
    {
        switch (option)
        {
            case 1:
                creditCash(accountNumber,amount);
                break;
            case 2:
                debitCash(accountNumber,amount);
                break;
            case 3:
                fundTransfer(amount, partnerAccountNumber);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public void bankingServices(int option, double amount, long partnerAccountNumber, long accountNumber)
    {
        switch (option)
        {
            case 1:
                creditCash(accountNumber,amount);
                break;
            case 2:
                debitCash(accountNumber,amount);
                break;
            case 3:
                fundTransfer(amount, partnerAccountNumber);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
