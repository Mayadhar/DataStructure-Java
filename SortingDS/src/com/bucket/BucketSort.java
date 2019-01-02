package com.bucket;

//Incomplete
public class BucketSort {
	public static void sorting(Integer arr[]) {
		Integer n = arr.length;
		// create empty buckets
		Integer[] b = new Integer[n];

		// put element in a different bucket
		for (Integer i = 0; i < n; i++) {
			Integer bi = n * arr[i];
			b[bi] = arr[i];
		}
		for(Integer i = 0;i<n;i++){
			
		}
	}
}
