package org.studyeasy.DAY9;

import java.util.HashSet;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 1:07 PM
 Project Name : 30Days_Java
 ***/
public class CheckDuplicate {
    static boolean SortedArray(int[] arr){//Brute Force Methods
        for(int j=0;j<arr.length-1;j++){
            if(arr[j] == arr[j+1]){
                return true;
            }
        }
        return false;
    }
    //Hash Set
    public static boolean containsDuplicate(int[] nums){//Using Hassh set which gives O(N) time complexity
        HashSet<Integer> set = new HashSet<Integer>();
            for(int n  : nums) {
                if (set.contains(n)) {
                    return true;
                }
                set.add(n);
            }
            return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,6,3,4,2,6,6};
        System.out.println(SortedArray(arr));
        System.out.println(containsDuplicate(arr));

    }
}
