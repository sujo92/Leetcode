package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 25, 15, 10, 5};
        printNGER(arr);
    }

    static void printNGER(int arr[]){
        Stack<Integer> stack = new Stack<>();
        Stack<int[]> res= new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            if(stack.isEmpty()){
                res.push(new int[]{arr[i], -1});
            }else{
                while(!stack.isEmpty() && arr[i] > stack.peek() ){
                    stack.pop();
                }
                int next = stack.isEmpty()? -1 :stack.peek();
                res.push(new int[]{arr[i], next});
            }
            stack.push(arr[i]);
        }

        while(! res.isEmpty()){
            int[] i = res.pop();
            System.out.println(i[0] +":"+ i[1]);
        }
    }
}
