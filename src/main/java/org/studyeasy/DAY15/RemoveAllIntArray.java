package org.studyeasy.DAY15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  30 12/30/2025 9:04 PM
 Project Name : 30Days_Java
 ***/
public class RemoveAllIntArray {
    public static void main(String[] args) {
        Integer arr[] = {1,1,1,1,2,3,3,4,56,7};
        Integer k =1;
        List<Integer> l = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));//used to print the array without using loop

        //using removeall() method
        // of arraylist collection
        l.removeAll(Arrays.asList(k));

        Integer[] newArr = l.toArray(new Integer[0]);
        //print the result
        System.out.println(Arrays.toString(newArr));
    }
}
