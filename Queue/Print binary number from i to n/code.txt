package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
	    printBinary(10);
    }

    public static void printBinary(int n){
        Deque<String> q = new ArrayDeque<>();
        q.add("1");

        for(int i=0; i<n; i++){
            String x = q.remove();
            q.add(x+"0");
            q.add(x+"1");
            System.out.println(x);
        }
    }
}
