package com.leetcode.stack;

public class Queue<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public void enQueue(E val) {
		Node<E> node = new Node<>(val);
		if (head == null) {
			head = tail = node;
			size++;
			return;
		}
		tail.next = node;
		tail = node;
		size++;
	}

	public Node<E> deQueue() throws Exception {
		if (head == null)
			throw new Exception("Queue is Empty");
		Node<E> node = head;
		if (head.next == null)
			tail = null;
		head = head.next;
		size--;
		return node;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		if (head == null)
			return "[]";
		Node<E> node = head;
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while (node != null) {
			sb.append(node.val + " ");
			node = node.next;
		}
		sb.append("]");
		return sb.toString();
	}

	public static class Node<E> {
		E val;
		Node<E> next;

		public Node(E val) {
			this.val = val;
			next = null;
		}
	}

}
