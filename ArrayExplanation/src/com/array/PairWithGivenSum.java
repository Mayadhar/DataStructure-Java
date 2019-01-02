package com.array;

import java.util.Scanner;

public class PairWithGivenSum {
	public static void main(String[] args) {
		Integer[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		Long startTime = 0L, endTime = 0L;
		System.out.print("Array Before : ");
		printArray(dataArray);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Given Number : ");

		// is Pair esists in array or not method - 1
		System.out.println("--------------Method 1-------------------");
		startTime = System.nanoTime();
		Integer x = sc.nextInt();
		System.out.println("Pair With Given Sum Exists(Method-1) : " + pairSumMethod1(dataArray, x));
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");

		System.out.println("--------------Method 2-------------------");
		// is Pair esists in array or not method - 2
		startTime = System.nanoTime();
		System.out.println("Pair With Given Sum Exists(Method-2) : " + pairSumMethod2(dataArray, x));
		endTime = System.nanoTime();
		System.out.print("Array After : ");
		printArray(dataArray);
		System.out.println("Time Taken : " + (endTime - startTime) + " NanoSeconds");
	}

	public static Boolean pairSumMethod1(Integer arr[], Integer x) {
		Integer i, j, k;
		// Find the pivot element
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				break;
			}
		}
		// j is now index of minimum element
		j = (i + 1) % arr.length;

		// k is now index of maximum element
		k = i;
		while (j != k) {
			// if pair exists then return Boolean.TRUE
			if (arr[j] + arr[k] == x) {
				return Boolean.TRUE;
			}
			// if current pair sum is less then move to the higher sum
			if (arr[j] + arr[k] < x) {
				j = (j + 1) % arr.length;
			}
			// move to the lower sum side
			else {
				k = (k + arr.length - 1) % arr.length;
			}
		}
		return Boolean.FALSE;
	}

	public static Boolean pairSumMethod2(Integer arr[], Integer x) {
		for (Integer i = 0; i < arr.length; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				//System.out.println("arr[" + i + "] = " + arr[i] + ", arr[" + j + "] = " + arr[j]);
				if (arr[i] + arr[j] == x) {
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.FALSE;
	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
