package org.studyeasy.DAY2;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 12/17/2025 12:26 PM
 Project Name : 30Days_Java
 ***/
public class StudentMarks {
    String name;
    int marks;

    public  StudentMarks(String n , int m){
        this.name = n;
        this.marks =m;
    }
    public void display(){
        System.out.println("Name: "+name+"\t Marks: "+marks);
    }
    public String isPassed(){
        if(marks >= 40){
            return "passed";
        }else{
            return "failed";
        }
    }

    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks("Tushar",85);
        s1.display();
        System.out.println(s1.name+" have "+s1.isPassed());
    }

}
