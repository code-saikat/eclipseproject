package com.leetcode.recursion;

public class CombinationNumber {

	public static int nCr(int n, int r) {
		if (r == 0 || r == n)
			return 1;
		return nCr(n - 1, r - 1) + nCr(n - 1, r);
	}

	public static void main(String[] args) {
		// nCr calculation of a number using the Pascal theorem
		// Time complexity -- O(2n)
		System.out.println("Result for nCr -->" + nCr(4, 0));

	}

}
