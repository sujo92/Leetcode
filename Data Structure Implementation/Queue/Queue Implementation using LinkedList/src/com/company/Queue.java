package com.company;

public class Queue {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    Node head;
    Node tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head==tail;
    }

    public void add(int x){
        Node newNode =new Node(x);

        if(tail==null){
            tail = newNode;
            head = tail;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }

    }

    public int remove(){
        if(head == null){
            System.out.println("Queue is Empty");
            return 0;
        }else{
            Node delNode = head;
            head= delNode.next;
            if (head == null) {
                tail=null;
            }
            return delNode.data;
        }
    }
}
