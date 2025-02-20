package com.celcom.BankAssignment;

import java.util.Scanner;



public class BankAccount {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Bank bank = new Bank();
	    int choice;

	    do {
	        System.out.println("Enter your choice:");
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

