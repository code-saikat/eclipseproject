package com.leetcode.dymanicprogramming;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[] = new int[] { 1, 2, 3 };
		int price[] = new int[] { 10, 15, 40 };
		System.out.println(knapsack(6, weight, price));
	}

	public static int knapsack(int target, int weight[], int price[]) {
		int maxprice[][] = new int[weight.length + 1][target + 1];
		for (int wt = 0; wt <= weight.length; wt++) {
			for (int capacity = 0; capacity <= target; capacity++) {
				if (wt == 0 || capacity == 0)
					maxprice[wt][capacity] = 0;
				else if (weight[wt-1] > capacity)
					maxprice[wt-1][capacity] = maxprice[wt - 1][capacity];
				else
					maxprice[wt][capacity] = Math.max(maxprice[wt - 1][capacity],
							(price[wt - 1] + maxprice[wt - 1][capacity - weight[wt-1]]));
			}
		}

		return maxprice[weight.length][target];
	}

}
