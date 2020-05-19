package com.company.pis;

public class Main {

    public static void main(String[] args) {
	    String s= "abc";
	    int l=0;
	    int r=s.length()-1;
	    permutation(s, l, r);
    }

    public static void permutation(String s, int l, int r){
        if(l == r){
            System.out.println(s);
            return;
        }else{
            for(int i=l; i<=r; i++){
                s = swap(s, l, i);
                permutation(s, l+1, r);
                s = swap(s, l, i);
            }
        }
    }

    public static String swap(String s, int l, int r){
        char[] sArr=  s.toCharArray();
        char temp = sArr[l];
        sArr[l] = sArr[r];
        sArr[r] = temp;

        return String.valueOf(sArr);
    }
}
