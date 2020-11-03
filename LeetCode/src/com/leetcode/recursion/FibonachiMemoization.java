package com.leetcode.recursion;

public class FibonachiMemoization {
	public static int memo[] = new int[10];

	public static int memoFib(int num) {
		if (num <= 1) {
			return num;
		} else {
			if (memo[num - 2] == -1) {
				memo[num - 2] = memoFib(num - 2);
			}
			if (memo[num - 1] == -1) {
				memo[num - 1] = memoFib(num - 1);
			}
		}
		memo[num] = memo[num - 2] + memo[num - 1];
		return memo[num];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://github.com/code-saikat/eclipseproject.git
		for (int i = 0; i < memo.length; i++)
			memo[i] = -1;
		System.out.println(memoFib(7));

	}

}
