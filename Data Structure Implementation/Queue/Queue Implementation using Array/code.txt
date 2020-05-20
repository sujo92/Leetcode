package com.company;

public class Queue {
    private int[] q;
    private int front;
    private int end;
    private int size;

    public Queue(int size){
        q = new int[size];
        this.size = size;
        this.front=0;
        this.end=0;
    }

    public boolean isEmpty(){
        if(front==0 && end==0)
            return true;
        else
            return false;
    }

    public void add(int x){
        if(end < size)
            q[end++]=x;
        else{
            System.out.println("Queue overflow");
        }
    }

    public int remove(){
        if(front ==  end){
            System.out.println("Queue is Empty");
            return 0;
        }else{
            int x = q[front];
            for(int i=0; i<end-1; i++){
                q[i] = q[i+1];
            }
            if(end < size){
                q[end-1] = 0;
            }
            end--;
            return x;
        }
    }
}
