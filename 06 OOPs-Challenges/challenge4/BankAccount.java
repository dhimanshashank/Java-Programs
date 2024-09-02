package kgcoding.challenge4;

public class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance = 0;

    // Constructor formation
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.isEmpty()){
            throw new IllegalArgumentException("Invalid account name.");
        }
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.isEmpty()){
            throw new IllegalArgumentException("Invalid account number.");
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            throw new IllegalArgumentException("Balance cannot be less than zero.");
        }
        this.balance = balance;
    }
}
