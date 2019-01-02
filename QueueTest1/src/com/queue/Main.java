package com.queue;

import java.util.Date;

import com.entity.Person;
import com.entity.Student;

public class Main {
	public static void main(String[] args) {
		IQueue queue = new IQueue();
		
		queue.enqueue(new Person(1L, "Mayadhar", "", "Sankhua", "Bengaluru", new Date()));
		queue.getDetails();
		queue.enqueue(new Person(2L, "Debasis", "", "Senapati", "Bhadrak", new Date()));
		queue.getDetails();
		queue.enqueue(new Person(3L, "Manoj", "Kumar", "Tripathy", "Bengaluru", new Date()));
		queue.getDetails();
		queue.enqueue(new Person(4L, "Alok", "Kumar", "Tripathy", "Bengaluru", new Date()));
		queue.getDetails();
		queue.enqueue(new Student(5L, 30L, "Omm", "Prakash Mohanty", "Bengaluru", new Date()));
		queue.getDetails();

		System.out.println(queue.dequeue().toString());
		queue.getDetails();
		System.out.println(queue.dequeue().toString());
		queue.getDetails();
		System.out.println(queue.dequeue().toString());
		queue.getDetails();
		System.out.println(queue.dequeue().toString());
		//System.out.println(queue.dequeue().toString());
		queue.getDetails();

	}
}
