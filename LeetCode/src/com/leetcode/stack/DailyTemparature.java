package com.leetcode.stack;

import java.util.Stack;

public class DailyTemparature {
	
	public int[] dailyTemperatures(int[] T) {
        if(T.length == 0 || T.length == 1) // base condition
            return new int[]{0};
        int length = T.length;
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(length -1);
        result[length -1] = 0;
        for(int i =length -2;i>=0;i--){
            while(!stack.isEmpty()){
                int peek = stack.peek();
                if(T[i]>T[peek]){
                    stack.pop();
                }else{
                    result[i] = peek - i;
                    break;
                }
            }
            stack.add(i);
            System.out.println(stack.peek());
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyTemparature temp = new DailyTemparature();
		int[] res = temp.dailyTemperatures(new int[]{73,74});
	}

}
