package com.leetcode.heap;

public class BuildHeap {

	public static void main(String args[]) {
		int arr[] = new int[] { 10, 2, 5, 20, 54, 62, 12, 80 };
		CreateHeap heap = new CreateHeap(arr);
		arr = heap.buildHeap(arr);
		for (int index = 0; index < arr.length; index++)
			System.out.print(arr[index] + " ");
	}

}
