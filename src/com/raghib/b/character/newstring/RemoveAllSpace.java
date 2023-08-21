package com.raghib.b.character.newstring;

//QUESTION -> Create a new string after removing all the spaces in a string.

public class RemoveAllSpace {

	public static void main(String[] args) {
		String storeString = "123 Its 456 Simple789";
		String newString = "";
		char storeChar = ' ';
		for(int i = 0; i < storeString.length(); i++) {
			storeChar = storeString.charAt(i);
			if(!Character.isWhitespace(storeChar)) {
				newString = newString + storeChar;
			}			
		}
		System.out.println("New String : "+newString);
	}
}
