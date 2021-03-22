package com.leetcode.stack;

public class TestStack {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(1);
		stack.push(10);
		System.out.println(stack);
		System.out.println("Size:"+ stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop().value);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop().value);
		System.out.println(stack.peek());
		System.out.println("Size:"+ stack.size());
		System.out.println(stack.pop().value);
		
		
		
	}

}
