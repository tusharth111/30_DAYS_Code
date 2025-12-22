package org.studyeasy.DAY7;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  22 12/22/2025 12:25 PM
 Project Name : 30Days_Java
 ***/
public class CountOcc {
    public static void main(String[] args) {
        String str = "ababcaabbaa";
        char c = 'a';
        int count =0;
        for(char ch : str.toCharArray()){
            if(ch == c){
                count++;
            }

        }
        System.out.println(count);
    }
}
