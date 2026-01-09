package org.studyeasy.DAY25;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 1/9/2026 9:14 PM
 Project Name : 30Days_Java
 ***/
public class FirstLastElem {
    static int First(int []arr,int x){
        int low = 0;
        int high = arr.length-1;
        int first =-1;
        while(low <= high){
            int mid = (low +high)/2;
            if(x == arr[mid]){
                first = mid;
                high = mid - 1;
            }else if(x< arr[mid]){
                high =  mid -1;
            }else{
                low = mid +1;
            }
        }
        return first;
    }
    static int Last(int []arr,int x){
        int low = 0;
        int high = arr.length-1;
        int last =-1;
        while(low <= high){
            int mid = (low +high)/2;
            if(x == arr[mid]){
                last = mid;
                low = mid + 1;
            }else if(x < arr[mid]){
                high =  mid -1;
            }else{
                low = mid +1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,5,5,5,67,123,125};
        int x = 5;//element to find the last and first occurence in array
        System.out.println("First occurence "+First(arr,x));
        System.out.println("Last Occurence "+Last(arr,x));
        }
}
