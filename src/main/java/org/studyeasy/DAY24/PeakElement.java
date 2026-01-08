package org.studyeasy.DAY24;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 1/8/2026 8:34 PM
 Project Name : 30Days_Java
 ***/
public class PeakElement {
    static int peak(int[] arr,int n){
        //search space for binary search
        int low= 1;
        int high = n-2;// since the first and last elements can not be peak element and if we using 0 and n-1 they will throw arrayoutofbound
        if(n==1){
            return 0;
        }
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]< arr[mid+1]){
                low = mid+1;
            }

            else {
                high = mid-1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,5,7,8,3};
        int n = arr.length;
        System.out.println(peak(arr,n));
    }
}
