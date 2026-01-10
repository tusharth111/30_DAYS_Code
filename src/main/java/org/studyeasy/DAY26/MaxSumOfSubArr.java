package org.studyeasy.DAY26;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  10 1/10/2026 8:49 PM
 Project Name : 30Days_Java
 ***/
public class MaxSumOfSubArr {
    static int maxSubArr(int []arr,int k ){
        int n = arr.length;
        if(n<k) return -1;
        int curr_win = 0;
        for(int i = 0;i<k;i++){
            curr_win += arr[i];
        }
        //calculate the first window
        // now we initialize a max_window and keep on increment the window and decrement the first element
        int max_win = curr_win;
        for(int j = k;j<n;j++){
            curr_win += arr[j]-arr[j-k];
            max_win = Math.max(curr_win,max_win);
        }
        return max_win;
    }
    public static void main(String[] args) {
        int []arr = {2, 1, 5, 1, 3, 2};
        int k  = 3;
        System.out.println(maxSubArr(arr,k));

    }
}
