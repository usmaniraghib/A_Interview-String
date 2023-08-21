package com.raghib.string.reverse;

//Program to reverse the string.

/**
*
 * Input: Enter the String which you want to reverse : raghib
 * Output:
After Reverse - reverseWord1 Using Static : bihgar

After Reverse - reverseWord2 Using Static : bihgar

After Reverse - Using Whileloop : bihgar

After Reverse - Using forloop : bihgar
*/ 

import java.util.Scanner;

public class ReverseString {
	public static String inputString = "";
	public static String resultString = "";
	
	public static void main(String[] args) {
		System.out.print("Enter the String which you want to reverse : ");

		Scanner scannerObject = new Scanner(System.in);
		inputString = scannerObject.nextLine();
		scannerObject.close();

		resultString = reverseWord1(inputString);
		System.out.println("");
		System.out.println("After Reverse - reverseWord1 Using Static : " + resultString);
		System.out.println("");
		
		resultString = reverseWord2(inputString);
		System.out.println("After Reverse - reverseWord2 Using Static : " + resultString);
		System.out.println("");
		
		int index = inputString.length();
		System.out.print("After Reverse - Using Whileloop : ");
		while (index > 0) {
			System.out.print(inputString.charAt(index - 1));
			--index;
		}
		System.out.println("");
		
		System.out.println("");
		System.out.print("After Reverse - Using forloop : ");
		for (int loopVar = inputString.length() - 1; loopVar >= 0; loopVar--) {
			System.out.print((inputString.charAt(loopVar)));
		}		
	}

	public static String reverseWord1(String inputString) {
		String reverseString = "";
		for (int indexVar = inputString.length(); indexVar > 0; --indexVar) {
			reverseString = reverseString + (inputString.charAt(indexVar - 1));
		}
		return reverseString;
	}
	
	public static String reverseWord2(String inputString) {
		String reverseString = "";
		for (int indexVar = 0; indexVar < inputString.length(); indexVar++) {
			reverseString = inputString.charAt(indexVar) + reverseString;
		}
		return reverseString;
	}

}
