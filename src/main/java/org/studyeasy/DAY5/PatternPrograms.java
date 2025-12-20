package org.studyeasy.DAY5;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  20 12/20/2025 7:08 PM
 Project Name : 30Days_Java
 ***/
public class PatternPrograms {
    public static void main(String[] args) {
        int n =4;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
    }
    public static void pattern1(int n)
    {
        for(int i =0;i<=n;i++){
            for(int j = 1;j<= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j< n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
       for(int i =1;i<=n;i++){
           for(int j = 0;j< n-i+1;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    public static void pattern4(int n){
        for(int i  = 1 ;i<=n;i++){//rows
            for(int j  = 1;j<=i;j++){//columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
