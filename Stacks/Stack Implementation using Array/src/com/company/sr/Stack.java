package com.company.sr;

public class Stack {
    int[] stack;
    int top=-1;
    int size;

    public Stack(int size){
        this.size=size;
        stack= new int[size];
    }

    public boolean isEmpty(){
        if(top == 0)
            return true;
        else
            return false;
    }

    public void push(int a){
        if(top >= size-1)
            System.out.println("Stack overflow");
        else {
            stack[++top] = a;
        }
    }

    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int a = stack[top--];
            return a;
        }
    }

    public int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            return stack[top];
        }
    }
}
