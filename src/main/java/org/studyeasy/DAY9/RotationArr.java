package org.studyeasy.DAY9;

import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 9:16 PM
 Project Name : 30Days_Java
 ***/
public class RotationArr {
    static void RotateArr(int arr[],int d){
        int n = arr.length;//length of the array
        d %= n;// handle the case where the d is greateer than length of the array
        reverse(arr,0,d-1); //first we reverse the elements till d
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int start,int end){//Array reverse function
        while(start<end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;//number of numbers are to be rotated to the end of the array
        int n = arr.length;//length of the array
         for (int i =0;i< arr.length;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
