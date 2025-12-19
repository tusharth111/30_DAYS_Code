package org.studyeasy.DAY4.SimpleBankingApp;

import java.util.Scanner;

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


    public double getBalance(){
        return balance;
    }
    public boolean validatePin(int enteredPin){
        return this.pin == enteredPin;
    }
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Deposited : "+ amount);

        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Amount withdrawn is  : "+ amount);
        }else{
            System.out.println("Insufficent balance or invalid amount ! ");
        }
    }
    public static void main(String[] args) {
        Account acc1 = new Account("101","Tushar",1234);
        if(acc1.validatePin(1234)){
            System.out.println("Login is successfull! ");
        }else {
            System.out.println("Wrong pin! ");
        }
        System.out.println("AccountNumber: "+ acc1.getAccountNumber());
        System.out.println("Name: "+ acc1.getName());
        System.out.println("Balance: "+ acc1.getBalance());
        acc1.deposit(10000.0);
        System.out.println("Balance: "+ acc1.getBalance());
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amountToWithdraw = sc.nextDouble();
        acc1.withdraw(amountToWithdraw);
        System.out.println("Balance: "+ acc1.getBalance());




    }
}
