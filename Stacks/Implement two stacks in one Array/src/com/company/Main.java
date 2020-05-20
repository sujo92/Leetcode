package com.company;

public class Main {

    public static void main(String[] args) {
	    TwoStackInOneArray s= new TwoStackInOneArray(5);
        System.out.println(s.push1(3));
        System.out.println(s.push1(5));
        System.out.println(s.push2(8));
        System.out.println(s.push2(15));
        System.out.println(s.push1(13));
        System.out.println(s.push1(50));
        System.out.println(s.peek1());
        System.out.println(s.pop1());
        System.out.println(s.peek1());
        System.out.println(s.pop1());
        System.out.println(s.peek1());
        System.out.println(s.pop1());
        System.out.println(s.peek2());
        System.out.println(s.pop2());
        System.out.println(s.peek2());
        System.out.println(s.pop2());

    }


}
