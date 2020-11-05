package com.leetcode.recursion;

public class TaylorSeries {

	public double p = 1, f = 1;

	public double taylorSeries(int num, int term) {
		double result=0;
		if (term == 0)
			return 1;
		result = taylorSeries(num, term - 1);
		p = p * num;
		f = f * term;
		return result + p/f;
	}

	public static void main(String[] args) {
		// time complexity--> O(n2)
		System.out.println("Taylor series--> "+new TaylorSeries().taylorSeries(1, 10));

	}

}
