package org.studyeasy.DAY2;

import java.awt.*;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 12/17/2025 12:36 PM
 Project Name : 30Days_Java
 ***/
public class RectangleArea {
    int length;
    int breadth;

    public RectangleArea(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public  void area(){
        System.out.println("Area of rectangle: "+ length*breadth);
    }
    public  void perimeter(){
        System.out.println("Perimeter of Rectangle : "+ 2*(length * breadth));

    }

    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea(15,10);
        r1.area();
        r1.perimeter();
    }
}
