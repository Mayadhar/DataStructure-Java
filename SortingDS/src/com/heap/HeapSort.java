package com.heap;

import com.main.Main;

public class HeapSort {
	public static void sorting(Integer arr[]) {
		Integer n = arr.length;
		// Building Heap Structure
		for (Integer i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Extract one by one from Heap
		for (Integer i = n - 1; i >= 0; i--) {
			// Move Current root to end of array
			Integer temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// Building heap Again.
			heapify(arr, i, 0);
		}

	}

	public static void heapify(Integer arr[], Integer n, Integer i) {
		Integer largest = i;
		Integer leftChild = 2 * i + 1;
		Integer rightChild = 2 * i + 2;
		if (leftChild < n && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		if (rightChild < n && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		if (largest != i) {
			Main.printArray(arr);
			Integer temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
}
