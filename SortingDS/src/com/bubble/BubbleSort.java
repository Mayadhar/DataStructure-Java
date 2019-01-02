package com.bubble;

import com.main.Main;

public class BubbleSort {
	public static void sorting(Integer arr[]) {
		Integer n = arr.length;
		for (Integer i = 0; i < n - 1; i++) {
			for (Integer j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Main.printArray(arr);
					arr[j] = (arr[j] + arr[j + 1]) - (arr[j + 1] = arr[j]);
				}
			}
		}
	}
}
