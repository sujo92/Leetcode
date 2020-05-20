package com.company;

public class Main {

    public static void main(String[] args) {
	    Queue q = new Queue(10);
	    q.add(10);
	    q.add(20);
	    q.add(80);
        System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

    }
}
