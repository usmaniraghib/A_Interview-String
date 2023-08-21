package com.raghib.c.character.print;

//QUESTION -> Print only lowercase character of a string.

public class PrintOnlyLowercaseCharacterOfString {
	
	public static void printLowerCaseCharacterOnly(String storeString) {
		String newString = "";
		char storeSingleChar = ' ';		
		for(int i = 0; i < storeString.length(); i++) {
			storeSingleChar = storeString.charAt(i);
			if(Character.isLowerCase(storeSingleChar)) {
				newString += storeSingleChar;								
			}	
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		printLowerCaseCharacterOnly("Its Simple");
	}
}
