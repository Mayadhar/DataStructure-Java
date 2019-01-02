package com.selection;

import com.main.Main;

public class SelectionSort {
	public static void sorting(Integer arr[]) {
		Integer n = arr.length;
		for (Integer i = 0; i < n - 1; i++) {
			Integer minIndex = i;
			for (Integer j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			arr[i] = (arr[i] + arr[minIndex]) - (arr[minIndex] = arr[i]);
			Main.printArray(arr);
		}
	}
}
