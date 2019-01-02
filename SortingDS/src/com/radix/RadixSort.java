package com.radix;

import java.util.Arrays;

import com.main.Main;

public class RadixSort {
	public static void sorting(Integer arr[]) {
		Integer max = getMax(arr, arr.length);
		for (Integer i = 1; max / i > 0; i *= 10) {
			Main.printArray(arr);
			countSort(arr, arr.length, i);
		}
	}

	public static void countSort(Integer arr[], Integer n, Integer i) {
		Integer output[] = new Integer[n];
		Integer j;
		Integer count[] = new Integer[10];
		Arrays.fill(count, 0);
		for (j = 0; j < n; i++) {
			count[(arr[j] / i) % 10]++;
		}
		for (j = 1; j < 10; j++) {
			count[j] += count[j - 1];
		}
		for (j = n - 1; j >= 0; j--) {
			output[count[(arr[j] / i) % 10] - 1] = count[j];
			count[(arr[j] / i) % 10]--;
		}
		for (j = 0; j < n; j++) {
			arr[j] = output[j];
		}
	}

	public static Integer getMax(Integer arr[], Integer n) {
		Integer max = arr[0];
		for (Integer i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
