package com.counting;

import java.util.Arrays;

import com.main.Main;

/**
 * Counting sort is a sorting technique based on keys between a specific range.
 * It works by counting the number of objects having distinct key values (kind
 * of hashing). Then doing some arithmetic to calculate the position of each
 * object in the output sequence.
 */
//Incomplete
public class CountingSort {

	public static void sorting(Integer arr[]) {
		Main.printArray(arr);
		Integer n = arr.length;
		Integer output[] = new Integer[31];
		Integer count[] = new Integer[31];
		Arrays.fill(count, 0);
		for (Integer i = 0; i < n; i++) {
			++count[arr[i]];
		}
		for (Integer i = 1; i <= n; i++) {
			count[i] += count[i - 1];
		}
		for (Integer i = 0; i < n; i++) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}
		for (Integer i = 0; i < n; i++) {
			arr[i] = output[i];
		}

	}

}
