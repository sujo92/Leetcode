package com.company;

public class TwoStackInOneArray {
    private int[] arr;
    private int top1;
    private int top2;

    public TwoStackInOneArray(int size){
        arr = new int[size];
        top1=-1;
        top2=size;
    }

    public boolean push1(int x){
        if(top1+1==top2){
            System.out.println("Stack overflow");
            return false;
        }else {
            arr[++top1] = x;
            return true;
        }
    }

    public boolean push2(int x){
        if(top2-1==top1){
            System.out.println("Stack overflow");
            return false;
        }else {
            arr[--top2] = x;
            return true;
        }
    }

    public int pop1(){
        if(top1==-1){
            System.out.println("Stack isEmpty");
            return 0;
        }else {
            return arr[top1--];
        }
    }

    public int pop2(){
        if(top2==arr.length){
            System.out.println("Stack isEmpty");
            return 0;
        }else {
            return arr[top2++];
        }
    }

    public int peek1(){
        if(top1==-1){
            System.out.println("Stack isEmpty");
            return 0;
        }else {
            return arr[top1];
        }
    }

    public int peek2(){
        if(top2==arr.length){
            System.out.println("Stack isEmpty");
            return 0;
        }else {
            return arr[top2];
        }
    }
}
