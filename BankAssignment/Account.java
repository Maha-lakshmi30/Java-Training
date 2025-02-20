package com.celcom.BankAssignment;

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
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn successfully.");
        } else if(amount<0){
        	System.out.println("The amount cannot be negative");
        }
        else {
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
