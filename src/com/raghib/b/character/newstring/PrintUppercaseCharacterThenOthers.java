package com.raghib.b.character.newstring;

//QUESTION -> Create a new string with uppercase first and then others.

public class PrintUppercaseCharacterThenOthers {

	public static void main(String[] args) {
		String storeString = "123 Its 456 Simple789";
		String newString = "";
		String newDigit = "";
		String newChar = "";
		char storeChar = ' ';
		for(int i = 0; i < storeString.length(); i++) {
			storeChar = storeString.charAt(i);
			if(Character.isUpperCase(storeChar)) {
				newDigit = newDigit + storeChar;
			} else {
				newChar = newChar + storeChar;
			}			
		}
		newString = newDigit + newChar;
		System.out.println("New String : "+newString);
	}
}
