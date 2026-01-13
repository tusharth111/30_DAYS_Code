package org.studyeasy.DAY29;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  13 1/13/2026 8:38 PM
 Project Name : 30Days_Java
 ***/
public class BubbleSort {
    static void bubble_sort(int arr[],int n){
        int temp;
        for(int i = 0;i<n-1;i++){
            for (int j = 0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,9,5,6,4,3,2,1,7,8};
        int n = arr.length;
        System.out.println("Unsorted array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted array: ");
        bubble_sort(arr,n);
        for(int i : arr){
            System.out.print(i+" ");
        }


    }
}
