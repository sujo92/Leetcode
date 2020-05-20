package com.company;

public class Stack {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    private Node root;

    public boolean isEmpty(){
        if(root==null)
            return true;
        else{
            return false;
        }
    }

    public void push(int x){
        Node temp = new Node(x);
        if(root == null){
            root= temp;
        }else{
            Node temp1 = root;
            root =temp;
            root.next= temp1;
        }
    }

    public int pop(){
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        }else {
            int x = root.data;
            root = root.next;
            return x;
        }
    }

    public int pull(){
        if(root==null){
            System.out.println("stack is Empty");
            return 0;
        }else {
            return root.data;
        }
    }
}
