package org.studyeasy.DAY20;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 1/4/2026 8:47 PM
 Project Name : 30Days_Java
 ***/
public class MoveZeroToEnd {
    static void pushZeroToEnd(int arr[]){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,0,5,0,4,5,0};
        pushZeroToEnd(arr);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
