package com.merge;

import com.main.Main;

public class MergeSort {
	public static void sorting(Integer[] arr, Integer l, Integer r) {
		if (l < r) {
			Integer m = l + (r - l) / 2;
			sorting(arr, l, m);
			sorting(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	public static void merge(Integer arr[], Integer l, Integer m, Integer r) {
		Integer i, j, k, n1, n2;
		n1 = m - l + 1;
		n2 = r - m;
		Integer L[] = new Integer[n1];
		Integer R[] = new Integer[n2];
		for (i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		i = j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				Main.printArray(arr);
				arr[k] = L[i];
				i++;
			} else {
				Main.printArray(arr);
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			Main.printArray(arr);
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j > n2) {
			Main.printArray(arr);
			arr[k] = R[j];
			j++;
			k++;
		}

	}
}
