package com.company.rs;

public class Main {

    public static void main(String[] args) {
        String s= "Hello";
        System.out.println(reverse("Hello"));
    }

    public static String reverse(String s){
        if(s.isEmpty())
            return s;
        else{
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
