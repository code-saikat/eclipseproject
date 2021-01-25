package com.leetcode.dymanicprogramming;

import java.util.Arrays;

public class StairCase {

	public static int T[];

	StairCase(int stair) {
		T = new int[stair + 1];
		Arrays.fill(T, -1);
	}

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
		//solving with memoization

		System.out.println(new StairCase(10).maxCase(10, new int[] { 2,4,6,8,9 }));
		for(int i=1;i<T.length;i++)
			System.out.println(i+" "+T[i]);

	}

	public int maxCase(int stair, int steps[]) {
		int total = 0;
		if (stair == 0) {
			return 1;
		}
		if (T[stair] != -1)
			return T[stair];
		for (int i = 0; i < steps.length; i++) {
			if (stair >= steps[i])
				total += maxCase(stair - steps[i], steps);
		}
		T[stair] = total;
		return T[stair];
	}

}
