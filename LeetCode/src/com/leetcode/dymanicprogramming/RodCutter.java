package com.leetcode.dymanicprogramming;

import java.util.Arrays;

public class RodCutter {

	static int cutRod(int price[], int n) {
		int maxcost[] = new int[n + 1];// to handle nth element
		Arrays.fill(maxcost, -1);
		maxcost[0] = 0;
		for (int i = 1; i < maxcost.length; i++) { // loop through every single unit or rod
			for (int j = 1; j <= i; j++) { // loop through price for every single unit
				if (i >= j)
					maxcost[i] = Math.max(maxcost[i], price[j - 1] + maxcost[i - j]);
			}
		}
		return maxcost[n];
	}

	public static void main(String[] args) {
		// problem statement
		// https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
		//int arr[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
		int arr[] = new int[] {3, 5, 8, 9, 10, 17, 17, 20 };
		int size = arr.length;
		System.out.println("Maximum Obtainable Value is " + cutRod(arr, size));

	}

}
