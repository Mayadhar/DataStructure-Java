package com.array;

public class FindElementInArray {

	public static void main(String[] args) {
		Integer[] dataArray = { 1, 2, 3, 3, 4, 5, 6 };
		Long startTime = 0L, endTime = 0L;
		System.out.print("Array Before : ");
		printArray(dataArray);

		// Find Element
		startTime = System.nanoTime();
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");
		System.out.println("Index of the element is : " + pivotedBinarySearch(dataArray, dataArray.length, 3));
	}

	public static Integer pivotedBinarySearch(Integer arr[], Integer n, Integer key) {
		Integer pivot = findPivot(arr, 0, n - 1);
		System.out.println("Pivot : " + pivot);
		if (pivot == -1) {
			return binarySearch(arr, 0, n - 1, key);
		}
		if (arr[pivot] == key) {
			return pivot;
		}
		if (arr[0] <= key) {
			return binarySearch(arr, 0, pivot - 1, key);
		}

		return binarySearch(arr, pivot + 1, n - 1, key);
	}

	public static Integer findPivot(Integer arr[], Integer low, Integer high) {
		if (high < low) {
			return -1;
		}
		if (high == low) {
			return low;
		}
		Integer mid = (low + high) / 2;
		System.out.println("Mid : " + mid);
		if (mid < high && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (mid > low && arr[mid] < arr[mid - 1]) {
			return (mid - 1);
		}
		if (arr[low] >= arr[mid]) {
			return findPivot(arr, low, mid - 1);
		}
		return findPivot(arr, mid + 1, high);
	}

	public static Integer binarySearch(Integer arr[], Integer low, Integer high, Integer key) {
		if (high < low) {
			return -1;
		}
		Integer mid = (low + high) / 2;
		if (key == arr[mid]) {
			return mid;
		}
		if (key > arr[mid]) {
			return binarySearch(arr, mid + 1, high, key);
		}
		return binarySearch(arr, low, mid - 1, key);
	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
