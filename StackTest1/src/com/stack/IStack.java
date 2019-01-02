package com.stack;

public class IStack<T> {
	private T[] stack;
	private Integer top;
	private Integer size;

	@SuppressWarnings("unchecked")
	public IStack() {
		super();
		this.top = -1;
		this.size = 10;
		stack = (T[]) new Object[this.size];
	}

	@SuppressWarnings("unchecked")
	public IStack(Integer size) {
		this.top = -1;
		this.size = size;
		stack = (T[]) new Object[this.size];
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean push(T person) {
		if (!isFull()) {
			stack[++top] = person;
			return true;
		}
		return false;
	}

	public T pop() {
		return stack[top--];
	}

}
