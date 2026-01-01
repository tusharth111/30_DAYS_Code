package org.studyeasy.DAY17;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 11:54 AM
 Project Name : 30Days_Java
 ***/
public class CheckBinary {
    public static boolean check(String s){
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!= '0'&&s.charAt(i)!='1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "tusahr1010";
        System.out.println(check(s));

    }
}
