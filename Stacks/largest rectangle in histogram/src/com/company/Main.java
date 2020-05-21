package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,6,2,3};
//        int[] arr = new int[]{6,7,5,2,4,5, 9,3};
//        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<int[]>  stack = new Stack<>();
        int maxArea = 0;
        int[] smallestOnLeftIndex = new int[heights.length];
        int smallonright= Integer.MAX_VALUE;

        for(int i=0; i<heights.length; i++){
            if(stack.isEmpty()){
                smallestOnLeftIndex[i] =  -1;
            }else{
                while(! stack.isEmpty() && stack.peek()[0] >= heights[i]){
                    stack.pop();
                }
                int smallonleft = stack.isEmpty()? -1: stack.peek()[1];
                smallestOnLeftIndex[i] =  smallonleft;
            }
            stack.push(new int[] {heights[i], i});
        }

        stack.clear();

        for(int i=heights.length-1; i>=0; i--){
            if(stack.isEmpty()){
                smallonright =  heights.length;
            }else{
                while(! stack.isEmpty() && stack.peek()[0] >= heights[i]){
                    stack.pop();
                }
                smallonright = stack.isEmpty()? heights.length: stack.peek()[1];
            }
            int width = smallonright-smallestOnLeftIndex[i]-1;
            int area = width * heights[i];
            maxArea = Math.max(area,maxArea);
            stack.push(new int[]{heights[i],i});
        }

        return maxArea;
    }

}
