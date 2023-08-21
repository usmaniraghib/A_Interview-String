package com.raghib.c.character.print;

//QUESTION -> Print only Digit of a string.

public class PrintDigitOfString {
	
	public static void printAllDigit(String storeString) {
		String newString = "";
		char storeSingleChar = ' ';		
		for(int i = 0; i < storeString.length(); i++) {
			storeSingleChar = storeString.charAt(i);
			if(Character.isDigit(storeSingleChar)) {
				newString += storeSingleChar;								
			}	
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		printAllDigit("123Its456Simple789");
		printAllDigit("123 Its 456 Simple789");		
	}
}
