package org.studyeasy.DAY38;

import java.lang.module.ModuleReader;
import java.util.HashMap;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  01 2/1/2026 12:11 PM
 Project Name : 30Days_Java
 ***/
public class MajorityElement {
    public static int majority(int[] nums) {//hash map
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {//for each loop to traverse the array
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }

        }
        return -1;//if no majority element
    }

    public static int MooreMajority(int nums[]) {
        int n = nums.length;
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                candidate = num;
            if (num == candidate) {
                count++;
            } else {
                count--;
            }

        }
        return candidate;
    }
        public static void main (String[]args){
            int nums[] = {1, 2, 3, 2, 1, 2, 1, 2, 2};
            System.out.println(majority(nums));
            System.out.println(MooreMajority(nums));
        }
    }

