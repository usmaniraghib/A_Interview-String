package com.raghib.a.character.count;

/**
 * 
 * @author raghi
 * 
 * Question 1 - Count Uppercase
 * 
 * Question 2 - Count Lowercase
 * 
 * Question 3 - Count Digit
 * 
 * Question 4 - Count Specific Character
 * 
 * Question 1 - Count Vowel
 *
 */
public class CountCase {

	public static void main(String[] args) {
		int countUppercase = 0, countLowercase = 0, countDigit = 0, countSpecificChar = 0, countVowel = 0;
		String storeString = "123 Its 456 Simple786";
		char storeCharacter = ' ';
		for(int i = 0; i < storeString.length(); i++) {
			storeCharacter = storeString.charAt(i);
			if(Character.isUpperCase(storeCharacter)) { //Checking Uppercase
				countUppercase++;				
			}
			if(Character.isLowerCase(storeCharacter)) { //Checking Lowercase
				countLowercase++;				
			}
			if(Character.isDigit(storeCharacter)) { //Checking Digit
				countDigit++;
			}
			char afterConvert = Character.toUpperCase(storeCharacter);
			if(afterConvert == 'S') { //Checking Specific Character
				countSpecificChar++;
			}
			if(afterConvert == 'A' || afterConvert == 'E' || afterConvert == 'I' || afterConvert == 'O' || afterConvert == 'U') { //Checking Vowel
				countVowel++;
			}
		}
		System.out.println("Count Uppercase Character in String are : "+countUppercase);
		System.out.println("Count Lowercase Character in String are : "+countLowercase);
		System.out.println("Count Digit in String are : "+countDigit);
		System.out.println("Count S Charatcer in String are : "+countSpecificChar);
		System.out.println("Count Vowels in String are : "+countVowel);
	}
}
