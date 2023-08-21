package com.raghib.sort;

/**
 * + POSITIVE
 * - NEGATIVE
 * 0 ZERO
 * 
 * REFERENCE:-
 * 
 * FOR STRING VALUE
 * https://www.youtube.com/watch?v=1tUiDaP41nM
 * 
 * FOR INTEGER VALUE
 * https://www.youtube.com/watch?v=cJ2eMUiCFy4
 */

//Bubble Sort [String Value Array, Integer Value Array, Ascending Sort, Decending Sort].

/**
*
 * Input: 
String stringArray[] = { "Zoo", "Par", "App", "Wet", "She" };
int integerArray[] = {4,2,1,5,3};
		
 * Output:
BUBBLE SORT - STRING SORT
App Par She Wet Zoo 
BUBBLE SORT - INTEGER SORT
1 2 3 4 5 
*/ 

public class BubbleSort {

	public static void bubbleSortString(String stringArray[]) {

		String temp;

		// Using Bubble Sort To Sort String Array
		for (int i = 0; i < stringArray.length; i++) { // IT REPRESENT ROUND
			for (int j = 0; j < stringArray.length - i - 1; j++) {
				if (stringArray[j].compareToIgnoreCase(stringArray[j + 1]) > 0) {	//ASCENDING SORT
				//if (stringArray[j].compareToIgnoreCase(stringArray[j + 1]) < 0) {	//DECENDING SORT
					temp = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = temp;
				}
			}
		}

		// For Display
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + " ");
		}
		System.out.println("");
	}

	
	public static void bubbleSortInteger(int intArray[]) {

		int temp;

		// Using Bubble Sort To Sort Integer Array
		for (int i = 0; i < intArray.length; i++) { // IT REPRESENT ROUND
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {	//ASCENDING SORT
				//if (intArray[j] < intArray[j + 1]) {	//DECENDING SORT
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}

		// For Display
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		String stringArray[] = { "Zoo", "Par", "App", "Wet", "She" };
		int integerArray[] = {4,2,1,5,3};
		
		System.out.println("BUBBLE SORT - STRING SORT");
		bubbleSortString(stringArray);
		
		System.out.println("BUBBLE SORT - INTEGER SORT");
		bubbleSortInteger(integerArray);
	}
}
