package org.studyeasy.DAY32;
//Code force problem practice

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 1/18/2026 8:29 PM
 Project Name : 30Days_Java
 ***/

public class Program1 {
    public static long simulate(long a,long b,boolean StartwithWhite){
        long white = a, dark = b;
        long layerSize = 1;
        int layer = 0;
        boolean whiteTurn = StartwithWhite;
        while(true){
            if(whiteTurn) {
                if (white < layerSize) break;
                white -= layerSize;
            }else{
                if(dark<layerSize) break;
                dark -= layerSize;

            }
            layer++;
            layerSize *=2;
            whiteTurn = !whiteTurn;
            }return layer;
        }
    public static void main(String[] args) {
        long a = 4;
        long b = 3;

        long startwhite = simulate(a,b,true);
        long startDark = simulate(a,b,false);
        System.out.println(Math.max(startwhite,startDark));
    }
}

