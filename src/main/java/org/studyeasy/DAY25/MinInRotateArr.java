package org.studyeasy.DAY25;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 1/9/2026 9:57 PM
 Project Name : 30Days_Java
 ***/
public class MinInRotateArr {
    static int min (int []arr){
        int low = 0;
        int high = arr.length-1;
        while(low < high ){
            int mid = (low+high)/2;
            if(arr[mid]< arr[high]){
                high = mid;
            }else{
                low = mid +1;//if arr[mid] > arr[low]
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        System.out.println(min(arr));
    }
}
