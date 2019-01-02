package com.doublelinkedlist;

import java.util.Date;

import com.entity.Person;
import com.entity.Student;

public class Main {

	public static void main(String[] args) {
		IDoubleLinkedList list = new IDoubleLinkedList();
		Student s = new Student(5L, 30L, "Omm", "Prakash Mohanty", "Bengaluru", new Date());
		list.insertLIFO(new Person(1L, "Mayadhar", "", "Sankhua", "Bengaluru", new Date()));
		list.insertLIFO(new Person(2L, "Debasis", "", "Senapati", "Bhadrak", new Date()));
		list.insertLIFO(new Person(3L, "Manoj", "Kumar", "Tripathy", "Bengaluru", new Date()));
		list.insertLIFO(new Person(4L, "Alok", "Kumar", "Tripathy", "Bengaluru", new Date()));
		list.insertLIFO(s);
		System.out.println("=============================================================");
		list.delete(s);
		list.displayList();
		
		System.out.println("****************************************************************************");
		
		IDoubleLinkedList listt = new IDoubleLinkedList();
		listt.insertFIFO(new Person(1L, "Mayadhar", "", "Sankhua", "Bengaluru", new Date()));
		listt.insertFIFO(new Person(2L, "Debasis", "", "Senapati", "Bhadrak", new Date()));
		listt.insertFIFO(new Person(3L, "Manoj", "Kumar", "Tripathy", "Bengaluru", new Date()));
		listt.insertFIFO(new Person(4L, "Alok", "Kumar", "Tripathy", "Bengaluru", new Date()));
		listt.insertFIFO(s);
		listt.delete(s);

		System.out.println("=============================================================");
		listt.displayList();
		
	}
}
