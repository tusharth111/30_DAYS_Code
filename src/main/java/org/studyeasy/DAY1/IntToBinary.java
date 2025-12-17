package org.studyeasy.DAY1;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  16 12/16/2025 1:53 PM
 Project Name : 30Days_Java
 ***/
public class IntToBinary {
    public static void decToBinary(int n){
        int binaryarr[] = new int[100];
        int i = 0;
        while (n >0){
            //modulus will give the remaider which is '0' or '1' and the remainder is stored in the array //
            binaryarr[i]=n%2;
            n = (n / 2);
            i++;
        }
        //print in reverse order
        for (int j = i-1;j>=0;j--){
            System.out.print(binaryarr[j]);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println( n );
        //System.out.print("Binary: ");
        //decToBinary(n);
        System.out.println();
        String binary="";
        while(n >0){
            binary = (n&1) + binary;
            n = (n >> 1);
        }
        System.out.println("Binary representation: "+binary);
    }
}
