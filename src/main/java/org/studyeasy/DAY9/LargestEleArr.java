package org.studyeasy.DAY9;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 12/24/2025 9:09 PM
 Project Name : 30Days_Java
 ***/
public class LargestEleArr {
    public static int Largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length -1];
    }

    public static void main(String[] args) {
        int arr[] ={12,3,4,56,7,8,99,100};
        System.out.println(Largest(arr));
    }
}
