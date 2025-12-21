package org.studyeasy.DAY6;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  21 12/21/2025 8:26 PM
 Project Name : 30Days_Java
 ***/
public class FileReadLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String sfilename = input.next();
        try{
            FileInputStream FI = new FileInputStream(sfilename);
            Scanner sc = new Scanner(FI);//used to read file not keyboard
            //this will read data till the end of data
            while(sc.hasNextLine()){
                String data = sc.nextLine();//put the  reed  data from the file to the variable data
                System.out.println(data);// used to print the data on the console
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());//get the message of any exception
        }
    }
}
