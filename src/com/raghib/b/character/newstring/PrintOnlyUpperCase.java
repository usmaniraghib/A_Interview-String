package com.raghib.b.character.newstring;

//QUESTION -> Create a new string containing only uppercase character.

public class PrintOnlyUpperCase {

	public static void main(String[] args) {
		String storeString = "Its Simple";
		String newString = "";
		char storeChar = ' ';
		for(int i = 0; i < storeString.length(); i++) {
			storeChar = storeString.charAt(i);
			if(Character.isUpperCase(storeChar)) {
				newString = newString + storeChar;
			}
		}
		System.out.println("New String : "+newString);
	}
}
