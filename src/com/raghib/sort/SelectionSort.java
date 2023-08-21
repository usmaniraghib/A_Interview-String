package com.raghib.sort;

/**
 * + POSITIVE - NEGATIVE 0 ZERO
 * 
 * REFERENCE:- * 
 * FOR STRING VALUE https://www.youtube.com/watch?v=GRNOoZeV6xc * 
 * FOR INTEGER VALUE https://www.youtube.com/watch?v=qI3I7skEVdU
 */

//Selection Sort [String Value Array, Integer Value Array, Ascending Sort, Decending Sort].

/**
*
 * Input:
String stringArray[] = { "Zoo", "Par", "App", "Wet", "She" };
int integerArray[] = { 4, 2, 1, 5, 3 };
		 
 * Output:
SELECTION SORT - STRING SORT - ASCENDING
App Par She Wet Zoo 
SELECTION SORT - STRING SORT - DESCENDING
Zoo
Wet
She
Par
App
SELECTION SORT - INTEGER SORT - ASCENDING
1 2 3 4 5 
SELECTION SORT - INTEGER SORT - DESCENDING
5
4
3
2
1
*/ 

public class SelectionSort {

	public static void selectionSortStringAscending(String stringArray[]) {

		String temp;
		int min;

		// Using Selection Sort To Sort String Array
		for (int i = 0; i < stringArray.length; i++) {
			min = i;
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[j].compareToIgnoreCase(stringArray[min]) < 0) { // ASCENDING SORT
					min = j;
				}
				temp = stringArray[i];
				stringArray[i] = stringArray[min];
				stringArray[min] = temp;
			}
		}

		// For Display
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}
		System.out.println("");
	}

	public static void selectionSortStringDescending(String[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[maxIndex]) > 0) { // Descending
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				String temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}

		// For Display
		for (String word : arr) {
			System.out.println(word);
		}
	}

	public static void selectionSortIntegerAscending(int intArray[]) {

		int temp;
		int min;

		// Using Selection Sort To Sort Integer Array
		for (int i = 0; i < intArray.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[min] > intArray[j]) { // ASCENDING SORT
					min = j;
				}
				temp = intArray[min];
				intArray[min] = intArray[i];
				intArray[i] = temp;
			}
		}

		// For Display
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
	}

	public static void selectionSortIntegerDescending(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) { // Descending
				int temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}

		// For Display
		for (int digit : arr) {
			System.out.println(digit);
		}
	}

	public static void main(String[] args) {
		String stringArray[] = { "Zoo", "Par", "App", "Wet", "She" };
		int integerArray[] = { 4, 2, 1, 5, 3 };

		System.out.println("SELECTION SORT - STRING SORT - ASCENDING");
		selectionSortStringAscending(stringArray);

		System.out.println("SELECTION SORT - STRING SORT - DESCENDING");
		selectionSortStringDescending(stringArray);

		System.out.println("SELECTION SORT - INTEGER SORT - ASCENDING");
		selectionSortIntegerAscending(integerArray);

		System.out.println("SELECTION SORT - INTEGER SORT - DESCENDING");
		selectionSortIntegerDescending(integerArray);

	}
}
