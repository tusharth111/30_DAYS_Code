package org.studyeasy.DAY9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 12:42 PM
 Project Name : 30Days_Java
 ***/
public class EvenOdd {
    static boolean isEven(int n){
        if((n&1)==0){
            return true;
        }else {
            return false;
        }
    }
    static void evenOdd(int n){
        if (n < 0){
            System.out.println("Please enter a positive integer");
        }
        else if( n % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (isEven(n) == true){
            System.out.println("The number is even");

        }else {
            System.out.println("The number is odd");
        }

        //basic if else statement
        evenOdd(n);

    }
}
