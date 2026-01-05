package org.studyeasy.DAY21;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  05 1/5/2026 8:37 PM
 Project Name : 30Days_Java
 ***/
public class MaxSumSubarrwithK {
    public static int MaxSum(int arr[],int k){
        int n = arr.length;
        if(n<=k){
            System.out.println("Invalid");
            return -1;
        }
        int max_sum = 0;
        for(int i =0;i<k;i++){
            max_sum += arr[i];//sum of the first window till k
        }
        int window_sum = max_sum;
        for(int i = k;i<n;i++){//loop starting fromt the k index till the last element
            window_sum += arr[i]- arr[i-k];//removing the first element from the next window
            max_sum = Math.max(window_sum,max_sum);
        }

        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] ={5,2,-1,0,3};
        int k = 3;//length of the subarray
        System.out.println(MaxSum(arr,k));

    }
}
