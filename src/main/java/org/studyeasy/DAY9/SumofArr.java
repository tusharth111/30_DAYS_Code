package org.studyeasy.DAY9;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 9:14 PM
 Project Name : 30Days_Java
 ***/
public class SumofArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum);
    }
}
