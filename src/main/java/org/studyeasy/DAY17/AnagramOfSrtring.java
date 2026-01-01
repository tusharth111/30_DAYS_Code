package org.studyeasy.DAY17;

import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 8:19 PM
 Project Name : 30Days_Java
 ***/
public class AnagramOfSrtring {
    public static boolean areAnagram(char str1[],char str2[]){
        int n1 = str1.length;
        int n2 = str2.length;

        if(n1!= n2){
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
        {
            if(str1[i] != str2[i]){
                return  false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        char str1[] = {'t','e','s','t'};
        char str2[] = {'e','s','t','t'};
        if(areAnagram(str1 ,str2)){
            System.out.println("these two strings are "+ "anagram of each other");
        }else {
            System.out.println("They are not a anagram of each other !");
        }

    }
}
