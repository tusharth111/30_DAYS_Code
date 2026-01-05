package org.studyeasy.DAY21;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  05 1/5/2026 8:10 PM
 Project Name : 30Days_Java
 ***/
public class ReverseStrTWOPointer {
    public static String reverse(String s){
        char str [] = s.toCharArray();
        int left = 0,right = str.length-1;
        while(left<right){
            char temp = str[left];
            str[left] = str[right];
            str[right] =  temp;
            left++;
            right--;

        }
        return new String(str);
    }
    public static void main(String[] args) {
        String s = "Hello world ";
        String res = reverse(s);
        System.out.println(res);
    }
}
