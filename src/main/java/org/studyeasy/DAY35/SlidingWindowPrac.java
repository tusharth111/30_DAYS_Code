package org.studyeasy.DAY35;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 1/22/2026 7:51 PM
 Project Name : 30Days_Java
 ***/
public class SlidingWindowPrac {
    static int MaxOFsum(int []arr,int k){
        int n = arr.length-1;
        int max_sum = 0;
        int l = 0,r=k-1;
        for(int i = 0;i<k;i++){
            max_sum += arr[i];
        }
        int curr_sum = max_sum;
        while(r<n){
            curr_sum = curr_sum - arr[l];
            l++;
            r++;
            curr_sum = curr_sum + arr[r];
            max_sum = Math.max(max_sum,curr_sum);
        }
        return max_sum;

    }
    public static void main(String[] args) {
        int arr[] = {-1,2,3,3,4,5,-1};
        int k = 4;
        System.out.println(MaxOFsum(arr,k));
    }
}
