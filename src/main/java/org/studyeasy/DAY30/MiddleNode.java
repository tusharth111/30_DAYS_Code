package org.studyeasy.DAY30;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  14 1/14/2026 8:34 PM
 Project Name : 30Days_Java
 ***/
class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data =data;
        this.next = null;
    }
}
public class MiddleNode {
    static int getLength(Node1 head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;//keep on going on the list untill the head.next is Null
        }
        return length;
    }
    static int getMiddle(Node1 head){
        int length = getLength(head);
        int midIndex = length/2;
        while(midIndex > 0){
            head = head.next;
            midIndex--;
        }
        return head.data;
    }
    public static void main(String[] args) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        head.next.next.next.next = new Node1(50);
        head.next.next.next.next.next = new Node1(60);
        System.out.print(getMiddle(head));
    }
}
