package com.leetcode.stack;

public class Stack<E> {

	private Node<E> top;
	private int size;

	/*
	 * Implementing push in O(N) time
	 */
	public void push(E ele) {
		Node<E> toAdd = new Node<>(ele);
		if (top == null) {
			top = toAdd;
			size++;
			return;
		}
		toAdd.next = top;
		top = toAdd;
		size++;
	}

	/*
	 * Implementing pop in O(N) time
	 */
	public Node<E> pop() throws Exception {
		if (top == null)
			throw new Exception("Stack is Empty");
		Node<E> node = top;
		top = top.next;
		size--;
		return node;
	}

	/*
	 * Implementing peek in O(N) time
	 */
	public E peek() throws Exception {
		if (top == null)
			throw new Exception("stack is Empty");
		return top.value;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		if (top == null)
			return "[]";
		Node<E> node = top;
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while (node != null) {
			sb.append(node.value);
			if (node.next != null)
				sb.append("->");
			node = node.next;
		}
		sb.append("]");
		return sb.toString();
	}

	public static class Node<E> {
		E value;
		Node<E> next;

		public Node(E value) {
			this.value = value;
			next = null;
		}
	}
}
