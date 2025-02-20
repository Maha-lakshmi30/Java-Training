package com.celcom.BankAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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