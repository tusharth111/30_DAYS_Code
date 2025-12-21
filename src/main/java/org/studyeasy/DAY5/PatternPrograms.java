package org.studyeasy.DAY5;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  20 12/20/2025 7:08 PM
 Project Name : 30Days_Java
 ***/
public class PatternPrograms {
    public static void main(String[] args) {
        int n =5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
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
                System.out.print("*");
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
    public static void pattern5(int n ){
        for(int row = 1;row < 2*n ;row++){
            int coltoPrint = row > n ? 2* n-row : row;
            for(int j =1 ; j  <= coltoPrint;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n ){
        for(int row = 1;row < 2*n ;row++){
            int coltoPrint = row > n ? 2* n-row : row;
            int NumberOfSpace = n - coltoPrint;
            for(int i = 0;i<NumberOfSpace;i++)
            {
                System.out.print(" ");
            }
            for(int j =1 ; j  <= coltoPrint;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n ){
        for(int row = 1 ;row<= n;row++)
        {
            for (int space = 0; space < n - row ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
    }

}
