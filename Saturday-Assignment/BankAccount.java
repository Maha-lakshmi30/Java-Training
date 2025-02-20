package com.celcom.Assignment1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Account {
    long account_Num;
    String accountHolder_Name;
    String branch_Name;
    long phone_Number;
    double balance;

    Account(long account_Num, String accountHolder_Name, String branch_Name, long phone_Number) {
        this.account_Num = account_Num;
        this.accountHolder_Name = accountHolder_Name;
        this.branch_Name = branch_Name;
        this.phone_Number = phone_Number;
    }

    void deposit(int amount) {
        this.balance += amount;
        System.out.println("Amount was successfully credited.");
    }

    void withDraw(int amount) {
	if(amount<0){
	     System.out.println("The amount cannot be negative);
	}else if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + account_Num + ", Account Holder: " + accountHolder_Name + 
               ", Branch Name: " + branch_Name + ", Phone Number: " + phone_Number + 
               ", Balance: " + balance;
    }
}

class Bank {

    private Map<Long, Account> map = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    // Method to add an account
    void addAccount() {
        System.out.println("Enter Account Number: ");   
        long accountNum = sc.nextLong();
        System.out.println("Enter AccountHolder Name: ");
        String accountHolderName = sc.next();
        System.out.println("Enter Branch name: ");
        String branchName = sc.next();
        System.out.println("Enter phone Number: ");
        long phoneNumber = sc.nextLong();
        Account account = new Account(accountNum, accountHolderName, branchName, phoneNumber);
        if(map.containsKey(accountNum)) {
        	System.out.println("The account already exists...");
        }
        else {
        	map.put(accountNum, account);
        	System.out.println("Account added successfully.");
        }
    }

    // Method to deposit money into an account
    void deposit(long accountNum, int amount) {
        Account account = map.get(accountNum);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    void withDraw(long accountNum, int amount) {
        Account account = map.get(accountNum);
        if (account != null) {
            account.withDraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to remove an account
    void removeAccount(long accountNum) {
        if (map.containsKey(accountNum)) {
            map.remove(accountNum);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to get account details
    void getAccountDetails(long accountNum) {
        Account account = map.get(accountNum);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class BankAccount {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Bank bank = new Bank();
	    int choice;

	    do {
	        System.out.println("\nEnter your choice:");
	        System.out.println("To Deposit --> Enter 1 ");
	        System.out.println("To Withdraw --> Enter 2 ");
	        System.out.println("To Add Account --> Enter 3 ");
	        System.out.println("To Delete Account --> Enter 4 ");
	        System.out.println("To Get Details --> Enter 5 ");
	        System.out.println("Exit --> Enter 6");
	        
	        choice = sc.nextInt(); // Menu choice is taken here

	        switch(choice) {
	            case 1:
	                // Deposit money into account
	                System.out.println("Enter Account Number and Amount to Deposit:");
	                long accountNumDeposit = sc.nextLong();
	                int amountDeposit = sc.nextInt();
	                bank.deposit(accountNumDeposit, amountDeposit);
	                break;

	            case 2:
	                // Withdraw money from account
	                System.out.println("Enter Account Number and Amount to Withdraw:");
	                long accountNumWithdraw = sc.nextLong();
	                int amountWithdraw = sc.nextInt();
	                bank.withDraw(accountNumWithdraw, amountWithdraw);
	                break;

	            case 3:
	                // Add a new account
	                bank.addAccount();
	                break;

	            case 4:
	                // Remove an existing account
	                System.out.println("Enter Account Number to Remove:");
	                long accountNumRemove = sc.nextLong();
	                bank.removeAccount(accountNumRemove);
	                break;

	            case 5:
	                // Get account details
	                System.out.println("Enter Account Number to Get Details:");
	                long accountNumDetails = sc.nextLong();
	                bank.getAccountDetails(accountNumDetails);
	                break;

	            case 6:
	                // Exit the program
	                System.out.println("Thank you...");
	                break;

	            default:
	                System.out.println("Invalid choice. Please try again.");
	                break;
	        }

	    } while(choice != 6); 

	    sc.close();
	}

}
