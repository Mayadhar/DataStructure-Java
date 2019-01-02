package com.linkedlist;

public class ILinkedList<T> {

	@SuppressWarnings({ "rawtypes" })
	private Node head;

	public ILinkedList() {
		System.out.println("Head = " + head);
	}
	
	@SuppressWarnings({ "rawtypes", "hiding" })
	class Node<T> {
		private T value;
		private Node link;
		
		@Override
		public String toString() {
			return "Node [ value = " +value+ ", link = " +link+ " ]";
		}
		
	}

	public boolean insertLIFO(T item) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.link = head;
		head = node;
		System.out.println("Head = " + head);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public boolean insertFIFO(T item) {
		if (head == null) {
			head = new Node<T>();
			head.value = item;
			head.link = null;
			System.out.println("Head = " + head);
			return true;
		}
		Node<T> n = new Node<T>();
		Node<T> node = new Node<T>();
		n = head;
		while(n.link != null){
			n = n.link;
		}
		node.value = item;
		node.link = null;
		n.link = node;
		System.out.println("Head = " + head);
		return true;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public void delete(T item) {
		if(head == null){
			System.out.println("Empty List");
		}else{
			Node<T> x = head;
			Node<T> y = head.link;
			
			while (true) {
				System.out.println("Here...2..");
				if(x.value == item){
					x = x.link;
					break;
				} else if (y == null || y.value == item) {
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void displayList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.link;
		}
	}

}
