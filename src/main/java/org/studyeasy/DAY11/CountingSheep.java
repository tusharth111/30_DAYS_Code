package org.studyeasy.DAY11;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  26 12/26/2025 11:46 AM
 Project Name : 30Days_Java
 ***/
public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        for(int i = 0;i<arrayOfSheeps.length;i++){
            if(arrayOfSheeps[i] == true){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Boolean[] arrayOfSheeps ={
                true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(countSheeps(arrayOfSheeps));
    }
}
