package org.studyeasy.DAY10;

import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  25 12/25/2025 12:06 PM
 Project Name : 30Days_Java
 ***/
public class MatrixTranpose {
    public static void main(String[] args) {
        int arr[][] = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}
        };
        System.out.println("The Normal Matrix: ");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix : ");
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

    }
}
