package org.studyeasy.DAY3;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 11:17 AM
 Project Name : 30Days_Java
 ***/
public class Fibonacci {
    public int calculateSum(int n ){
        if(n<=0){
            return 0;
        }
        int fibo[] = new int[n+1];
        fibo[0]= 0;
        fibo[1] = 1;

        int sum = fibo[0] + fibo[1];
        for(int i =2;i<= n;i++){
            fibo[i] = fibo[i-1]+ fibo[i-2];
            sum += fibo[i];
        }
        return sum;
    }
    public int calculatesumf(int n ){
        int a =0, b =0,sumf =1;
        if(n<=0){
            return 0;
        }
        int curr = 1;
        for (int i =2;i<=n;i++){
            a = b;
            b = curr;
            curr = a +b;
            sumf += curr;
        }
        return sumf;
    }
    public static void main(String[] args) {
        int n = 4;
        Fibonacci FB = new Fibonacci();
        System.out.println(FB.calculatesumf(n));

    }
}
