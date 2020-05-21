package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    int[] arr ={1, 3,2,4};
        NGEL(arr);
    }

    public static void NGEL(int[] arr){
        Stack<Integer> stack = new Stack<>();
        List<int[]> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                res.add(new int[]{arr[i], -1});
            }else{
                while(! stack.isEmpty() && arr[i] > stack.peek()){
                    stack.pop();
                }
                int next = stack.isEmpty()? -1: stack.peek();
                res.add(new int[]{arr[i], next});
            }
            stack.push(arr[i]);
        }

        for(int[] i: res){
            System.out.println(i[0]+"->"+i[1]);
        }
    }

}
