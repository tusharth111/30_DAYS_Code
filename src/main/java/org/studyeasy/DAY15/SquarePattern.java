package org.studyeasy.DAY15;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  30 12/30/2025 8:42 PM
 Project Name : 30Days_Java
 ***/
public class SquarePattern {
    public static void main(String[] args)
    {
        int row = 6;
        int columns =6;
        SquareEmptyPattern(row, columns);

    }

    private static void SquareEmptyPattern(int row, int columns) {
        int i ;
        int j;
        for( i = 1;i<=row;i++)//print the rows
        {
            for( j = 1;j<=columns;j++){//print the columns and starrs
                //Conditions to print star only at the start index and the end index of the row and columns ;
                if (i == 1|| i == row || j == 1|| j == columns)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
