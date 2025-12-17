package org.studyeasy.DAY2;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 12/17/2025 11:56 AM
 Project Name : 30Days_Java
 ***/
public class ComplexNum {
    int real;
    int image;
    public ComplexNum(int r , int i){
        this.real = r;
        this.image = i;
    }
    public void show(){
        System.out.println(this.real+" + i"+  this.image);
    }
    public static ComplexNum add(ComplexNum n1, ComplexNum n2){
        ComplexNum res= new ComplexNum(0,0);

        res.real = n1.real + n2.real;

        res.image = n1.image + n2.image;
        return res;
    }
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(4,5);
        ComplexNum c2 = new ComplexNum(3, 5);

        System.out.println("First Complex Number ");
        c1.show();

        System.out.println("Second Complex Number ");
        c2.show();
        ComplexNum res = add(c1 ,c2);
        System.out.println("Addition is :");
        res.show();
    }
}
