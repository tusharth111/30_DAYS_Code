package org.studyeasy.DAY18;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  02 1/2/2026 9:00 PM
 Project Name : 30Days_Java
 ***/
public class PrimeUptoN {
    public static void main(String[] args) {
        int n  = 10;
        for(int i = 2;i<=n;i++){
            int count  = 0;
            for (int j = 1; j <= n; j++)
            {
                if(i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+ " ");
            }
        }

    }
}
