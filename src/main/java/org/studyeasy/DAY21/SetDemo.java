package org.studyeasy.DAY21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  05 1/5/2026 12:20 PM
 Project Name : 30Days_Java
 ***/
public class SetDemo {
    public static void main(String[] args) {
        Integer count[] = {1,22,3,4,2,22,1,1};//we have to specify the class since the collection can not take primitive datatype
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(count));
        System.out.println(set);

        Set<String> vowelsSet = new HashSet<>();
        vowelsSet.add("a");
        vowelsSet.add("e");
        vowelsSet.add("i");
        vowelsSet.add("o");
        vowelsSet.add("u");

        String vowels[] = vowelsSet.toArray(new String[vowelsSet.size()]);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowelsSet.contains("i"));
    }
}
