package com.leetcode.heap;

public class CreateHeap {

	public int heapSize;

	CreateHeap(int arr[]) {
		heapSize = arr.length;
	}

	//Time complexity O(n)
	//Space complexity O(logn)
	public int[] buildHeap(int[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			heapify(arr, i);
		}
		return arr;
	}

	//Time complexity O(logn)
	//Space complexity O(logn)
	private void heapify(int[] arr, int index) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		if (left < heapSize && arr[largest] < arr[left])
			largest = left;
		if (right < heapSize && arr[largest] < arr[right])
			largest = right;
		if (largest != index) {
			int temp = arr[largest];
			arr[largest] = arr[index];
			arr[index] = temp;
			heapify(arr, largest);
		}

	}

}
