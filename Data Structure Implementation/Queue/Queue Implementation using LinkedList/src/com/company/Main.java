package com.company;

public class Main {

    public static void main(String[] args) {
	    Queue q= new Queue();
	    
	    q.add(10);
	    q.add(50);
	    q.add(120);
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
