package org.studyeasy.DAY2;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 12/17/2025 11:46 AM
 Project Name : 30Days_Java
 ***/
public class Factorial {
    public static int fact(int num ){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact *i;

        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 4;
        int res = fact(n);
        System.out.println("factorial of "+n+" is "+res);
    }
}
