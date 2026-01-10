package org.studyeasy.DAY26;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  10 1/10/2026 9:09 PM
 Project Name : 30Days_Java
 ***/
public class NumberOfSubarray {
    static int StriclyIncreasing(int arr[]){
        int count = 0;
        int len =1;
        int n = arr.length;
        for(int i = 1;i<n;i++){
            if(arr[i]> arr[i-1]){
                len++;
            }else {
                count += (len*(len-1 ))/2;
                len = 1;
            }
        }
        count += (len*(len-1))/2;
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,4};
        System.out.println(StriclyIncreasing(arr));
    }
}
