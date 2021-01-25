package com.leetcode.recursion;

import java.util.Arrays;

public class CatalanNumber {

	public static long memoize[];

	public CatalanNumber(int n) {
		memoize = new long[n + 1];
		Arrays.fill(memoize, -1);
	}

	public long computeCatalan(int n) {
		long sum = 0;
		if (memoize[n] != -1)
			return memoize[n];
		if (n <= 1) {
			memoize[n] = 1;
			return memoize[n];
		}
		for (int i = 1; i <= n; i++)
			sum += computeCatalan(i - 1) * computeCatalan(n - i);
		memoize[n] = sum;
		return memoize[n];

	}

	public static void main(String[] args) {
		// Catalan number using memoization
		// https://practice.geeksforgeeks.org/problems/nth-catalan-number0817/1
		CatalanNumber catalan = new CatalanNumber(3);
		catalan.computeCatalan(3);
		for (int i = 0; i < memoize.length; i++)
			System.out.print(memoize[i] + " ");

	}

}
