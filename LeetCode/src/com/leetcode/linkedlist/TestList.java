package com.leetcode.linkedlist;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList<Integer> list = new CustomLinkedList<>();
		list.add(12);
		list.add(1);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		list.add(50);
		list.add(58);
		list.add(78);
		System.out.println(list);
		list.remove();
		System.out.println(list);

	}

}
