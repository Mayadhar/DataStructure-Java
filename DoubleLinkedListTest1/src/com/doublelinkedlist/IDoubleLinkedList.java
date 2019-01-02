package com.doublelinkedlist;

public class IDoubleLinkedList<T> {

	@SuppressWarnings({ "rawtypes" })
	private Node head;

	public IDoubleLinkedList() {
		System.out.println("Head = " + head);
	}
	
	@SuppressWarnings({ "rawtypes", "hiding" })
	class Node<T> {
		private T value;
		private Node prev;
		private Node next;
		
		@Override
		public String toString() {
			return "Node [ value = " +value+ ", Next = " +next+ " ]";
		}
		
	}

	@SuppressWarnings("unchecked")
	public boolean insertLIFO(T item) {
		if(head == null){
			head = new Node<>();
			head.prev = null;
			head.value = item;
			head.next = null;
			return true;
		}
		Node<T> node = new Node<T>();
		node = head;
		head.next = null;
		head.value = item;
		head.prev = node;
		System.out.println("Head = " + head);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public boolean insertFIFO(T item) {
		if (head == null) {
			head = new Node<T>();
			head.next = null;
			head.value = item;
			head.prev = null;
			System.out.println("Head = " + head);
			return true;
		}
		
		Node<T> n = new Node<T>();
		Node<T> node = new Node<T>();
		n = head;
		while(n.next != null){
			n = n.next;
		}
		node.prev = n;
		node.value = item;
		node.next = null;
		n.next = node;
		System.out.println("Head = " + head);
		return true;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public void delete(T item) {

	}

	@SuppressWarnings("rawtypes")
	public void displayList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}
