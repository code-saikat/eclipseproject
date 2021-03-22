package com.leetcode.stack;

public class QueueTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<>();
		q.enQueue(7);
		q.enQueue(14);
		System.out.println(q+" "+q.size());
		q.deQueue();
		System.out.println(q+" "+q.size());
	}

}
