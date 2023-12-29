package org.example;

import java.util.List;

public class Node {
    Integer data;
    Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }
    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node ConstructFromList(List<Integer> dataList) {
        Node head = null;
        Node tail = null;

        for (Integer data : dataList) {
            Node newNode = new Node(data, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }
}
