package sg.edu.nus.iss;

import java.util.*;

public class BankAccount {
    
    //Atribute
    private final String accountNo;
    private String fullName;
    private double balance = 0.0;
    private Boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    //Constructor
    // public BankAccount(String accountNo, String fullName) {
    //     this.accountNo = accountNo;
    //     this.fullName = fullName;
    // }    

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }



    //Getter&Setter
    public String getAccountNo() {
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    public void showAccount(){
        System.out.println("Account no: "+ accountNo);
        System.out.println("Fullname:"+ fullName);
        System.out.println("Balance:"+ balance);
    }


    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isActive="
                + isActive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }

    public void deposit(double amount){

        if(!isActive){
            throw new IllegalArgumentException("You cannot deposit to a closed account");
        }

        if(amount<0){
            throw new IllegalArgumentException("You cannot make negative deposit");
        }
        else{
            balance= balance+amount;
        }
    }

    public void withdraw(double amount){

        if(!isActive){
            throw new IllegalArgumentException("You cannot withdraw from a closed account");
        }

        if(balance<amount){
            throw new IllegalArgumentException("Your balance is less than "+ amount);
        }
        else{
            balance = balance-amount;
        }

    }
   
}
