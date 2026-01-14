package org.studyeasy.DAY30;

import java.util.Optional;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  14 1/14/2026 8:14 PM
 Project Name : 30Days_Java
 ***/
class Node{
    int data;
    Node prev;
    Node next;
    Node(int value){
        data = value;
        next = null;
        prev = null;
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        Node head = new Node(10);//always insertion happens at the head
        // Creating and linking the second node
        head.next = new Node(20);
        head.next.prev = head;
        //Create and link the third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("<->");
            }
            temp = temp.next;
        }
    }
}
