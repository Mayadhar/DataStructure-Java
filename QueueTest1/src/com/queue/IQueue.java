package com.queue;

public class IQueue<T> {
	private T[] queue;
	private Integer size;
	private Integer total;
	private Integer front;
	private Integer rear;

	public IQueue(){
		size = 100;
		queue = (T[]) new Object[this.size];
		total = 0;
		front = 0;
		rear = 0;
	}
	public IQueue(int size){
		this.size = size;
		queue = (T[]) new Object[this.size];
		total = 0;
		front = 0;
		rear = 0;
	}
	public boolean isFull(){
		return (size == total);
	}
	public boolean enqueue(T item){
		if(isFull()){
			return false;
		}
		total++;
		this.queue[this.rear] = item;
		//rear++;
		rear = (rear + 1) % size;
		return true;
	}
	public T dequeue(){
		T item = queue[front];
		//front++;
		front = (front + 1) % size;
		total--;
		return item;
	}
	public void getDetails(){
		System.out.println("Size = " + size);
		System.out.println("Total = " + total);
		System.out.println("Front = " + front);
		System.out.println("Rear = " + rear);
	}
}
