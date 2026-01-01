package org.studyeasy.DAY17;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 11:59 AM
 Project Name : 30Days_Java
 ***/
public class CamelCase {
    public static String check(String s){
        StringBuilder res = new StringBuilder();

        boolean capitalizeNext = false;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                capitalizeNext = true;
            } else if (capitalizeNext == true) {
                res.append(Character.toUpperCase(s.charAt(i)));

                capitalizeNext = false;

            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "geeks for geeks";
        System.out.println(check(s));
    }
}
