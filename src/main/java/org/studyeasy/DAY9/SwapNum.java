package org.studyeasy.DAY9;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 12:58 PM
 Project Name : 30Days_Java
 ***/
public class SwapNum {
    static void swapMath(int a,int b){

    }
    static void swapBit(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);

    }

    public static void main(String[] args) {
        swapBit(1,2);
    }
}
