package org.studyeasy.DAY34;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  21 1/21/2026 8:57 PM
 Project Name : 30Days_Java
 ***/
public class LongestpalindromeSubstr {
    static String LongestPalindrome(String s ) {
        int start  = 0, end = 0;
        for(int i = 0;i< s.length();i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > (end - start)){
                start = i -(len -1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end +1);
    }
    static int expand(String s , int left ,int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(LongestPalindrome(s));





    }
}
