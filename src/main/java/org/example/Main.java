package org.example;


// then press Enter. You can now see whitespace characters in your code.


import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static Node ReverseNodeList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static Integer UpdataNodeValue(Node head){
//        head.data = 10;
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
            System.out.println("hahahahaha");


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
            System.out.println("houjiasong");
            return 3;
        }
//        head.data = 100;
        return 1;
    }
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
    }
}