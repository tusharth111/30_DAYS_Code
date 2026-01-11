package org.studyeasy.DAY27;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  11 1/11/2026 8:26 PM
 Project Name : 30Days_Java
 ***/
public class PreserveSpace {
    static String preserveSpace(String s){
        int n = s.length();
        int start = 0;
        int end = n-1;
        char[] str = s.toCharArray();
        while(start< end){
            if(str[start] == ' '){
                start++;
                continue;
            } else if (str[end] == ' ')
            {
                end--;
                continue;
            }
            else {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(str);
    }
    public static void main(String[] args) {
        String s = "hello world ";
        System.out.println(preserveSpace(s));
    }
}
