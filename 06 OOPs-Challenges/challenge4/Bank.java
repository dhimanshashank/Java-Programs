package kgcoding.challenge4;

import java.util.Scanner;

public class Bank {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Banking application...\n");
        BankAccount bankAccount = new BankAccount("abc123", "Shashank");

        System.out.println("Please select the services you want to access:");
        System.out.println("1: Account Balance\n2. Deposit Money\n3. Withdraw Money\n");

        System.out.print("Enter the service number (1-3): ");
        int service = sc.nextInt();

        if (service == 1){
            accountBalanceDetail(bankAccount);
        } else if (service == 2) {
            depositMoney(bankAccount);
        } else if (service == 3){
            withdrawMoney(bankAccount);
        } else {
            throw new IllegalArgumentException("Invalid input.");
        }
    }

    private static void accountBalanceDetail(BankAccount bankAccount){
        System.out.printf("Your current balance is: %f", bankAccount.getBalance());
    }

    private static void depositMoney(BankAccount bankAccount){
        System.out.print("Enter the amount you want to deposit: ");
        double money = sc.nextDouble();
        if (money <= 0) {
            throw new IllegalArgumentException("You cannot deposit negative money");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() + money);
            System.out.println("\nYour balance is updated successfully...\n");
            System.out.printf("Your current balance is: %f", bankAccount.getBalance());
        }
    }

    private static void withdrawMoney(BankAccount bankAccount){
        System.out.print("Enter the amount you want to withdraw: ");
        double money = sc.nextDouble();
        double bankBalance = bankAccount.getBalance();
        if (money <= 0) {
            throw new IllegalArgumentException("You cannot withdraw negative money");
        } else if (money <= bankBalance) {
            bankBalance -= money;
            System.out.println("\nYour balance is updated successfully...\n");
            System.out.printf("You have withdraw %f amount.\n", money);
            System.out.printf("Your current balance is: %f", bankBalance);
        } else {
            money = bankBalance;
            bankBalance = 0;
            System.out.println("\nYour balance is updated successfully...\n");
            System.out.printf("You have withdraw %f amount.", money);
            System.out.printf("Your current balance is: %f", bankBalance);
        }
    }
}
