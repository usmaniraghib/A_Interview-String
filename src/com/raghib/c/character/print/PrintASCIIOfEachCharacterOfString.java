package com.raghib.c.character.print;

//QUESTION -> Print ASCII code of each character of a string.

public class PrintASCIIOfEachCharacterOfString {
	
	public static void printASCII(String storeString) {
		for(int i = 0; i < storeString.length(); i++) {
			char storeSingleChar = storeString.charAt(i);
			System.out.println(storeSingleChar +" -> "+(int)storeSingleChar);
		}
	}
	
	public static void asciiTable() {
        System.out.println("ASCII Value\tCharacter");
        for (int i = 0; i <= 127; i++) {
            char character = (char) i;
            System.out.println(i + "\t\t" + character);
        }
    }

	public static void main(String[] args) {
		printASCII("Its Simple");	
		asciiTable();
	}
}
