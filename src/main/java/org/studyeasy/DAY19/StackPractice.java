package org.studyeasy.DAY19;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  03 1/3/2026 10:45 AM
 Project Name : 30Days_Java
 ***/
public class StackPractice {
    public static List<String> Reverse(List<String> list){
        Stack<String> stack = new Stack<>();
        while(!list.isEmpty()){
            stack.push(list.remove(0));
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(Reverse(list));
        Stack<Integer> intStack = new Stack<>();//With default value of 10 as the size of the stack
        intStack.push(1);//index 5
        intStack.push(2);//index 4
        intStack.push(3);//index 3
        intStack.push(8);//index 2
        intStack.push(5);//index 1
        //get the last or top most value of the stack
        System.out.println(intStack.peek());//top most value of the stack
        System.out.println(intStack.search(5));//It  will get us the index of the 5 in the stack
        intStack.pop();// this will remove the top most value of the stack
        System.out.println(intStack.peek());
        System.out.println(intStack.capacity());//this will get the size or capacity of the stack
        System.out.println(intStack.lastIndexOf(1));
        intStack.remove(3);//removee the element on the specified index
        intStack.push(4);
        System.out.println(intStack);//to print the values in the Stack



    }
}
