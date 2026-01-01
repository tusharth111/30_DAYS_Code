package org.studyeasy.DAY17;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 1/1/2026 8:40 PM
 Project Name : 30Days_Java
 ***/
public class RemoveZero {
    public static String removeZero(String str){
        int i =0;
        while(i<str.length() && str.charAt(i)=='0') {
            i++;
        }
        StringBuffer sb =new StringBuffer(str);//we are using string buffer beacuse it is mutable
        sb.replace(0,i,"");

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "00000012324";
        str = removeZero(str);
        System.out.println(str);
    }
}
