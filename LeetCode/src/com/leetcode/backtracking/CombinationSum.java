package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> sublist = new ArrayList<Integer>();
		computeCombination(candidates, target, sublist, 0);
		return result;
	}

	private void computeCombination(int[] candidates, int target, List<Integer> sublist, int index) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			result.add(new ArrayList(sublist));
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			sublist.add(candidates[i]);
			computeCombination(candidates, target - candidates[i], sublist, i);
			sublist.remove(sublist.size() - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = new int[] { 2, 3, 6, 7 };
		CombinationSum sum = new CombinationSum();
		sum.combinationSum(candidates, 7);
		System.out.println(sum.result);

	}

}
