package org.studyeasy.DAY17;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 12:11 PM
 Project Name : 30Days_Java
 ***/
public class CountSubstring {
    public static int Endingwith(String s){
        int n = s.length();
        int count=0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)== '1'){

                for (int j = i+1; j < n; j++) {
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
        }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "00010101";
        System.out.println(Endingwith(s));
    }
}
