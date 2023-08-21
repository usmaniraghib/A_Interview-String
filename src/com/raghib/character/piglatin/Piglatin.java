package com.raghib.character.piglatin;

// STRING ENCODING PROGRAM - PIGLATIN

/**
 * REFERENCE
 * [Time = 11:25]
 * https://www.youtube.com/watch?v=uAs73RA_BDg
 */

/**
*
 * Input: 
String str = "London";
String stq2 = "Own";
 * Output:
PIGLATIN WORD Of LONDON Is : ONDONLAY
PIGLATIN WORD Of OWN Is : OWNWAY
*/ 

public class Piglatin {
	
	public static void getString(String str) {
		String pigLatinWord = "";
		String convertUpper = str.toUpperCase();
		
		for(int i = 0; i < convertUpper.length(); i++) {
			char c = convertUpper.charAt(i);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				if(i == 0) {
					pigLatinWord += convertUpper +"WAY";
				} else {
					pigLatinWord += convertUpper.substring(i) + convertUpper.substring(0, i) + "AY";					
				}
				break;
			}
		}
		System.out.println("PIGLATIN WORD Of "+convertUpper+" Is : "+pigLatinWord);
	}

	public static void main(String[] args) {
		getString("London");
		getString("Own");

	}

}
