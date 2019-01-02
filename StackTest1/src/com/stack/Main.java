package com.stack;

import java.util.Date;

import com.entity.Person;
import com.entity.Student;

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		IStack stack = new IStack();
		stack.push(new Person(1L, "Mayadhar", "", "Sankhua", "Bengaluru", new Date()));
		stack.push(new Person(2L, "Debasis", "", "Senapati", "Bhadrak", new Date()));
		stack.push(new Person(3L, "Manoj", "Kumar", "Tripathy", "Bengaluru", new Date()));
		stack.push(new Person(4L, "Alok", "Kumar", "Tripathy", "Bengaluru", new Date()));
		stack.push(new Student(5L, 30L, "Omm", "Prakash Mohanty", "Bengaluru", new Date()));

		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
	}
}
