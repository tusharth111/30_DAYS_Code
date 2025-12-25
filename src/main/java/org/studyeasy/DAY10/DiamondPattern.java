package org.studyeasy.DAY10;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 12/25/2025 11:49 AM
 Project Name : 30Days_Java
 ***/
public class DiamondPattern {
    public static void main(String[] args) {
        int number = 7;
        int m,n;
        //Outer loop 1
        //print the first half of the diamond shape
        for(m =1;m<=number;m++){
            for(n = 1;n<= number -m;n++){
                System.out.print(" ");
            }
            for(n = 1;n<=m * 2-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop
        //print the second half of the diamond
        for(m = number;m>0;m--){
            for(n =1;n<=number-m;n++){
                //spaces
                System.out.print(" ");
            }
            for(n =1;n<=m *2 -1;n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
