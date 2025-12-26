package org.studyeasy.DAY11;

import java.util.ArrayList;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  26 12/26/2025 12:02 PM
 Project Name : 30Days_Java
 ***/
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);//simple add function of ArrayList collection
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        list1.add(1,2);// this method used to add the element a desired index and shifting the other elements
        System.out.println(list1);
        //remove the element
        list1.remove(1);
        System.out.println(list1);
        list1.set(1,2);//it is used to replace the value at a index with another value
        System.out.println(list1);
    }
}
