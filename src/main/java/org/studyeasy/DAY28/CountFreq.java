package org.studyeasy.DAY28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  12 1/12/2026 8:51 PM
 Project Name : 30Days_Java
 ***/
public class CountFreq {
    static ArrayList<ArrayList<Integer>> countf(int [] arr){
        //stores frequency of each number
        HashMap<Integer,Integer> mp = new HashMap<>();
        //stores {numbers,frequency}
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        //count frequency using HashMap
        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : mp.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            ans.add(temp);
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr = {10,10,20,20,1,3,4};
        ArrayList<ArrayList<Integer>> ans = countf(arr);

        // sort the result in ascending order of the number
        ans.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        for (ArrayList<Integer> x : ans) {
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
}
