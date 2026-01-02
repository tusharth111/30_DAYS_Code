package org.studyeasy.DAY18;

import java.util.ArrayList;
import java.util.Arrays;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  02 1/2/2026 8:22 PM
 Project Name : 30Days_Java
 ***/
public class MergeSortedArrays {
    public static int[] MergeSortedarr(int[] A, int B[]) {
        int i =0,j =0,k =0;
        int []C = new int[A.length+B.length];// a new Array C which has the length of the both A and B

        while (i<A.length && j<B.length){
            if(A[i]<= B[j]){
                C[k++] = A[i++];

            }else {
                C[k++] = B[j++];
            }
        }
        //Copy remaing elements
        while(i<A.length){
            C[k++] = A[i++];
        }
        while (j<B.length){
            C[k++] = B[j++];
        }
        return C;
    }

    public static void main(String[] args) {
        int A[] = {1, 3, 4};
        int B[] = {2, 6,7};
        System.out.println(Arrays.toString(MergeSortedarr(A,B)));

    }
}
