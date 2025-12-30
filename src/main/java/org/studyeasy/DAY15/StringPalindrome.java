package org.studyeasy.DAY15;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  30 12/30/2025 9:17 PM
 Project Name : 30Days_Java
 ***/
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "tits";
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println("its not a palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        int i =0;int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
