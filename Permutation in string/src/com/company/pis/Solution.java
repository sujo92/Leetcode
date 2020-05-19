package com.company.pis;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s1="ab";
        String s2="fljhdansdsavbab";
       System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1 == null || s1.length() > s2.length())
            return false;

        int[] s1Hash = new int[26];
        int[] s2Hash = new int[26];
        int windowSize =s1.length();

        for(char c: s1.toCharArray()){
            s1Hash[c-'a']++;
        }

        int start=0;
        int s2len = s2.length();
        char[] arr = s2.toCharArray();

        for(int i=0; i<s2len; i++){
            int index = arr[i]-'a';
            s2Hash[index]++;

            if(i >= windowSize){
                s2Hash[arr[i-windowSize]- 'a' ]--;
            }

            if(Arrays.equals(s1Hash,s2Hash))
                return true;

        }
        return false;
    }
}
