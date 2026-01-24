package org.studyeasy.DAY37.Hangman;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  24 1/24/2026 8:47 PM
 Project Name : 30Days_Java
 ***/
public class MaxPointFromCard {
    static int maxPoint(int arr[],int k){
        int n = arr.length;
        int lsum = 0,rsum = 0,maxsum = 0;
        for(int i = 0;i<k;i++){//sum first k elements to lsum
            lsum = lsum +arr[i];

        }
        maxsum =lsum;
        int right = n-1;// element from the rioght side of arr
        for(int i = k-1;i>=0;i--){
            lsum = lsum -arr[i];
            rsum = rsum + arr[right];
            right--;//keep on going to the left by decrementing
            maxsum = Math.max(maxsum,lsum+rsum);//update the maxsum from the lsum and maxsum
        }

        return maxsum;
    }
    public static void main(String[] args) {
        int []arr = {6,2,3,4,7,2,1,7,1};
        int k = 4 ;
        System.out.println(maxPoint(arr,k));
    }

}
