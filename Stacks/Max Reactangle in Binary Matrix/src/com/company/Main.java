package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int A[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };
        System.out.println(maxAreaInBinaryMatrix(A));

    }

    public static int maxAreaInBinaryMatrix(int[][] matrix){
        int[] arr = new int[matrix[0].length];
        int maxAreaReactangle =0;

        for(int[] m: matrix){
            for(int i=0; i<m.length; i++){
                if(m[i]==1)
                    arr[i]+=m[i];
                else
                    arr[i]=0;
            }
            int area = largestRectangleArea(arr);
            maxAreaReactangle= Math.max(maxAreaReactangle, area);
        }
        return maxAreaReactangle;
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
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
