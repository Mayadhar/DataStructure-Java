package com.quick;

import com.main.Main;

public class QuickSort {
	public static Integer partition(Integer arr[], Integer low, Integer high) {
		Integer pivot = arr[high];
		Integer i = (low - 1); // index of the smaller element
		for (Integer j = low; j < high; j++) {
			if (arr[j] <= pivot) { // if current element is smaller than pivot
									// element
				Main.printArray(arr);
				i++;
				// System.out.println("pivot = " + pivot + ", i = " + i + ", j =
				// " + j + ", arr[j] = " + arr[j] + ", arr[i] = " + arr[i]);
				Integer temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Integer temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		Main.printArray(arr);
		return i + 1;
	}

	public static void quickSort(Integer arr[], Integer low, Integer high) {
		if (low < high) {
			Integer pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);

		}
	}

}
