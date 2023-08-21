package com.raghib.b.character.newstring;

//QUESTION -> Write a program to change the case of each character in string. 
//[Means convert uppercase character lowercase and lowercase character to uppercase]

public class ChangeTheCaseOfEachCharacter {

	public static void main(String[] args) {
		String storeString = "Its Simple";
		String newString = "";
		char storeChar = ' ';
		for(int i = 0; i < storeString.length(); i++) {
			storeChar = storeString.charAt(i);
			if(Character.isUpperCase(storeChar)) {
				newString = newString + Character.toLowerCase(storeChar);
			} else {
				newString = newString + Character.toUpperCase(storeChar);
			}
		}
		System.out.println("New String : "+newString);
	}
}
