package org.studyeasy.DAY20;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  04 1/4/2026 8:22 PM
 Project Name : 30Days_Java
 ***/
public class SumPairtoTarget {
    public static boolean TwoSum(int arr[],int target){
        int i = 0;
        int j = arr.length -1;
        while (i<j){
            int sum = arr[i] + arr[j];

            if(sum == target){
                return true;
            } else if (sum < target) {
                i++;

            }else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,25,40,50};
        int target = 70;
        System.out.println(TwoSum(arr,target));
    }
}
