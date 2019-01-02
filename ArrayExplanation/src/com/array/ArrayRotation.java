package com.array;

public class ArrayRotation {
	public static void main(String[] args) {
		Integer[] dataArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
		Long startTime = 0L, endTime = 0L;
		ArrayRotation main = new ArrayRotation();
		System.out.print("Array Before : ");
		main.printArray(dataArray);

		// Using Left Rotate
		startTime = System.nanoTime();
		main.rotationMethod1(dataArray, 3, dataArray.length);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		main.printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		// resetting array
		dataArray = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };

		// Using Juggling Algorithm
		startTime = System.nanoTime();
		main.rotationMethod2(dataArray, 3, dataArray.length);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		main.printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		dataArray = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };

		// Using Reverse Algorithm
		startTime = System.nanoTime();
		main.usingReverseAlgorithm(dataArray, 3);
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		main.printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");
	}

	// Using Temp Array left rotate by "d" element
	public void rotationMethod1(Integer arr[], Integer d, Integer n) {
		System.out.println("------------Method 1--------------");
		for (int i = 0; i < d; i++) {
			Integer temp = arr[0];
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
	}

	// Using Juggling Algorithm
	public void rotationMethod2(Integer array[], Integer d, Integer n) {
		System.out.println("------------Method 2--------------");
		for (int i = 0; i < gcd(d, n); i++) {
			Integer j, k, temp;
			temp = array[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				array[j] = array[k];
				j = k;
			}
			array[j] = temp;
		}
	}

	public Integer gcd(Integer d, Integer n) {
		if (n == 0) {
			return d;
		} else {
			return gcd(n, d % n);
		}
	}

	// Reversal Algorithm
	public void usingReverseAlgorithm(Integer arr[], Integer d) {
		System.out.println("------------Method 3--------------");
		int n = arr.length;
		this.reverseArray(arr, 0, d-1);
		this.reverseArray(arr, d, n-1);
		this.reverseArray(arr, 0, n-1);
	}
	
	public void reverseArray(Integer arr[], Integer start, Integer end){
		Integer temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
