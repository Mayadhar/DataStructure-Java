package com.insertion;

import com.main.Main;

public class InsertionSort {
	public static void sorting(Integer arr[]) {
		Integer n = arr.length;
		for (Integer i = 1; i < n; ++i) {
			Integer key = arr[i];
			Integer j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				Main.printArray(arr);
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
