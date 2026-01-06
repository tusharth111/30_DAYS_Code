package org.studyeasy.DAY22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  06 1/6/2026 11:36 AM
 Project Name : 30Days_Java
 ***/
public class JavaFilePractice {
    public static void main(String[] args) {
        try {
            File Obj = new File("myfile.txt");

            // Creating File
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("File in java is seriously good!");
            writer.close();
            System.out.println("Successfully writter");
        } catch (IOException e) {
            System.out.println("Error has occured");
            e.printStackTrace();
        }
            File Obj = new File("myfile.txt");
            try {
                Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine()) {
                    String data = Reader.nextLine();
                    System.out.println(data);
                }
                Reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occured ");
                e.printStackTrace();
            }
    }
}
//To delete a file just use object.delete()