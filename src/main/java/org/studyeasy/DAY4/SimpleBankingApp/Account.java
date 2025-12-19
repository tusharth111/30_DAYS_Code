package org.studyeasy.DAY4.SimpleBankingApp;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  19 12/19/2025 12:15 PM
 Project Name : 30Days_Java
 ***/
public class Account {
    private String accountNumber;
    private String name;
    private int pin;
    private double balance;

    public Account(String accountNumber, String name, int pin){
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;//initial balance
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public boolean validatePin(int enteredPin){
        return this.pin == enteredPin;
    }

    public static void main(String[] args) {
        Account acc1 = new Account("101","Tushar",1234);

        System.out.println("AccountNumber: "+ acc1.getAccountNumber());
        System.out.println("Name: "+ acc1.getName());
        System.out.println("Balance: "+ acc1.getBalance());
        acc1.setBalance(10000);
        System.out.println("Balance: "+ acc1.getBalance());

        if(acc1.validatePin(1234)){
            System.out.println("Login is successfull! ");
        }else {
            System.out.println("Wrong pin! ");
        }
    }
}
