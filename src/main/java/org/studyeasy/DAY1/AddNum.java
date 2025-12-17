package org.studyeasy.DAY1;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  16 12/16/2025 1:15 PM
 Project Name : 30Days_Java
 ***/
public class AddNum {
    public static int sum(int num1 , int num2 ){
        return  num1+num2;
    }
    public static double sum(double num1 , double num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        double i = 12.3;
        double j = 12.4;
        AddNum obj = new AddNum();
        double res = obj.sum(i,j);
        System.out.println(res);
    }
}
