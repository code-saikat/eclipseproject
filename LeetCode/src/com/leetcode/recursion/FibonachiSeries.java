package com.leetcode.recursion;

public class FibonachiSeries {

	public static int fib(int num) {
		if (num <= 1) {
			return num;
		}
		return fib(num - 2) + fib(num - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(20));
	}

}
