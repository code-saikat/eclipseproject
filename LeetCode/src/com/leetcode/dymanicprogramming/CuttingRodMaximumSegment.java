package com.leetcode.dymanicprogramming;

import java.util.Arrays;

public class CuttingRodMaximumSegment {

	public static void main(String[] args) {
		// https://practice.geeksforgeeks.org/problems/cutted-segments1642/1
		System.out.println(new CuttingRodMaximumSegment().maximizeCuts(100,15,23,50));
		

	}
	
	public int maximizeCuts(int n, int x, int y, int z) {
		int cut[] = new int[] {x,y,z};
		int dp[] = new int[n+1];
		Arrays.sort(cut);
		for(int i=0;i<=n;i++){
			for(int j=0;j<cut.length;j++) {
				if(i%cut[j]==0)
					dp[i] = Math.max(dp[i], i/cut[j]);
				else if(i>=cut[j]) {
					if(dp[i-cut[j]]>0) {
						dp[i] = Math.max(dp[i], 1+dp[i-cut[j]]);
					}
				}
				else
					break;
			}
		}
		return dp[n];
	}

}
