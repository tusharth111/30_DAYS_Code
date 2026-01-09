package org.studyeasy.DAY25;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  09 1/9/2026 9:49 PM
 Project Name : 30Days_Java
 ***/
public class SquRootOfInt {
    static int squareRoot(int n){
        int low = 0;
        int high = n;
        int res = 1;
        while(low <= high){
            int mid = (low +high)/2;
            if(mid* mid <=n ){
                res = mid ;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(squareRoot(n));
    }
}
