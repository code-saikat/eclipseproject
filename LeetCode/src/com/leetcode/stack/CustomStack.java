package com.leetcode.stack;

import com.leetcode.linkedlist.CustomLinkedList;
import com.leetcode.linkedlist.CustomLinkedList.Node;

public class CustomStack<E> {
	
	CustomLinkedList<E> list = new CustomLinkedList<>();
	public void push(E element) {
		list.add(element);
	}
	
	public E pop() throws Exception{
		Node<E> node = list.remove();
		if(node == null)
			throw new Exception("Nothing to pop form the list");
		return node.item;
	}
	
	public E peek() throws Exception{
		Node<E> node = list.getLastElement();
		if(node == null)
			throw new Exception("List is Empty");
		return node.item;
	}
	
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}

}
