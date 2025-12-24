package org.studyeasy.DAY9;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 1:27 PM
 Project Name : 30Days_Java
 ***/
public class ReverseArray {
    public static void swap(int arr[],int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,12};
        int start = 0;
        int end = arr.length-1;
        while(start != end){
            swap(arr,start,end);
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
