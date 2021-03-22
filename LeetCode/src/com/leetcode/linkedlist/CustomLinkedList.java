package com.leetcode.linkedlist;

public class CustomLinkedList<E> {

	private Node<E> head;

	/*
	 * Adding element in the last of the linked list
	 */
	public void add(E element) {
		Node<E> node = new Node<>(element);
		if (head == null) {
			head = node;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	/*
	 * Removing element from the last of the linked list
	 */
	public Node<E> remove() {
		Node<E> temp = head;
		Node<E> prev = null;
		if (temp == null)
			return null; // Base case: if list is null
		if (temp.next == null) { // Base case: if list contains only one node
			head = null;
			return temp;
		}
		while (temp.next != null) { // Loop through the nodes to get last & second last node
			prev = temp;
			temp = temp.next;
		}
		prev.next = null; // set second last node next pointer to null
		return temp;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/*
	 * Method size() will return the length of the linked list
	 */
	public int size() {
		int length = 0;
		if (head != null) {
			Node<E> temp = head;
			while (temp != null) {
				length++;
				temp = temp.next;
			}
		}
		return length;
	}
	
	public Node<E> getLastElement(){
		Node<E> temp = head;
		if(isEmpty()) {
			return null;
		}
		while(temp.next!= null) {
			temp = temp.next;
		}
		return temp;
	}

	@Override
	public String toString() {
		if (head == null)
			return null;
		Node<E> temp = head;
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		while (temp != null) {
			buffer.append(temp.item);
			if(temp.next!= null)
				buffer.append("->");
			temp = temp.next;
		}
		buffer.append("]");
		return buffer.toString();
	}

	/*
	 * Inner class to create node object
	 */
	public static class Node<E> {
		public E item;
		public Node<E> next;

		public Node(E item) {
			this.item = item;
			next = null;
		}
	}

}
