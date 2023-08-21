package com.raghib.c.character.print;

//QUESTION -> Print only uppercase character of a string.

public class PrintOnlyUppercaseCharacterOfString {
	
	public static void printUpperCaseCharacterOnly(String storeString) {
		String newString = "";
		char storeSingleChar = ' ';		
		for(int i = 0; i < storeString.length(); i++) {
			storeSingleChar = storeString.charAt(i);
			if(Character.isUpperCase(storeSingleChar)) {
				newString += storeSingleChar;								
			}	
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		printUpperCaseCharacterOnly("Its Simple");
	}
}
