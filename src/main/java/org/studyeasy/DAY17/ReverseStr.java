package org.studyeasy.DAY17;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 8:29 PM
 Project Name : 30Days_Java
 ***/
public class ReverseStr {
    public static void main(String[] args) {
       String str = "hello";
       StringBuilder rev = new StringBuilder();
       rev.append(str);

       rev.reverse();

        System.out.println(rev);

    }
}
