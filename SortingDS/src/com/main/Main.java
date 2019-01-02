package com.main;

import com.bubble.BubbleSort;
import com.counting.CountingSort;
import com.heap.HeapSort;
import com.insertion.InsertionSort;
import com.merge.MergeSort;
import com.quick.QuickSort;
import com.selection.SelectionSort;

public class Main {

	public static void main(String[] args) {
		System.out.println("==================Quick Sort====================");
		Integer[] dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };

		Long startTime = 0L, endTime = 0L;
		System.out.print("Array Before : ");
		printArray(dataArray);

		startTime = System.nanoTime();
		QuickSort.quickSort(dataArray, 0, dataArray.length - 1);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Selection Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		SelectionSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Bubble Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		BubbleSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Insertion Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		InsertionSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Merge Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		MergeSort.sorting(dataArray, 0, dataArray.length - 1);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Heap Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		HeapSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Radix Sort====================");
		dataArray = new Integer[] { 61929, 532, 30, 1, 899, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		HeapSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("==================Counting Sort====================");
		dataArray = new Integer[] { 12, 2, 30, 1, 8, 7, 21, 4 };
		System.out.print("Array Before : ");
		printArray(dataArray);
		startTime = System.nanoTime();
		CountingSort.sorting(dataArray);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");
	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
