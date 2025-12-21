package org.studyeasy.DAY6;

import java.io.File;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  21 12/21/2025 7:58 PM
 Project Name : 30Days_Java
 ***/
public class FileCreation {

    public static void main(String[] args) {
        final String file_name = "file.txt";
        try{
            File obj  = new File(file_name);
            if(obj.createNewFile()){
                System.out.println("File created successfully");

            }else
            {
                System.out.println("File creation failed! ");
            }
        } catch (Exception e) {
            System.out.println("Exception: "+ e.toString());
        }
    }
}
