package com.raghib.c.character.print;

//QUESTION -> Print letter or digit of a string.

public class PrintAlphaNumericOfString {
	
	public static void printAlphanumeric(String storeString) {
		String newString = "";
		char storeSingleChar = ' ';		
		for(int i = 0; i < storeString.length(); i++) {
			storeSingleChar = storeString.charAt(i);
			if(Character.isLetterOrDigit(storeSingleChar)) {
				newString += storeSingleChar;								
			}	
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		printAlphanumeric("123 Its 456 Simple789");
	}
}
