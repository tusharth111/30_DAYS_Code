package org.studyeasy.DAY27;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  11 1/11/2026 8:45 PM
 Project Name : 30Days_Java
 ***/
public class Sortingbinary {
    static void sort012(int[]arr,int n){
        int c0 = 0,c1=0,c2=0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                c0++;
            }else if(arr[i] == 1){
                c1++;
            }else{
                c2++;
            }
        }
        int idx =0;

        for(int i = 0;i<c0;i++){
            arr[idx++] = 0;
        }
        for(int i = 0;i<c1;i++){
            arr[idx++] = 1;
        }
        for(int i = 0;i<c2;i++){
            arr[idx++] = 2;
        }

    }
    public static void main(String[] args) {
        int [] arr ={0,1,2,1,0,0,1,0,1,2,2,2};
        int n = arr.length;
        sort012(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" " );

        }
    }
}
