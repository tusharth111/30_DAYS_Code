package org.studyeasy.DAY24;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  08 1/8/2026 8:02 PM
 Project Name : 30Days_Java
 ***/
public class CountonesinArr {
    static  int CountOne(int arr[]){
        int left = 0;
        int right= arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == 0){
                right = mid-1;
            } else if (mid == arr.length-1 || arr[mid+1] != 1) {
                return mid+1;

            }else{
                left = mid +1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,0,0};
        System.out.println(CountOne(arr));

    }
}
