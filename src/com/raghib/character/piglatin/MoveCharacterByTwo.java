package com.raghib.character.piglatin;

// QUESTION - Create a word encoding program which moves each letter by 2. 
/*
 * EXAMPLE - A become C / B become D / Y become A and so on...
 */

/**
*
 * Input: String str = "Simply"; String str2 = "Owz";
 * Output:
UKORNA
QYB
*/ 

/**
 * REFERENCE
 * [Time = 13:00]
 * https://www.youtube.com/watch?v=uAs73RA_BDg
 */

public class MoveCharacterByTwo {
	
	public static void asciiTable() {
        System.out.println("ASCII Value\tCharacter");

        for (int i = 65; i <= 90; i++) {
            char character = (char) i;
            System.out.println(i + "\t\t" + character);
        }
        
        for (int i = 0; i <= 127; i++) {
            char character = (char) i;
            System.out.println(i + "\t\t" + character);
        }
    }

	public static void getString(String str) {
		String newWord = "";
		String convertUpper = str.toUpperCase();
		
		for(int i = 0; i < convertUpper.length(); i++) {
			char c = convertUpper.charAt(i);			
			if(c == 'Y' || c == 'Z') {
//				System.out.println("Inside If Condition");
//				int asciiValue = c;  
//				System.out.println("The ASCII value of " + c + " is: " + asciiValue);
//				int res = asciiValue - 26;
//				System.out.println(asciiValue +" - "+26 +" = "+res);
//				
//				char charValue = (char) res;  
//				System.out.println("The Char value of " + res + " is: " + charValue);
				
				//? -> 63 Decimal ASCII Value
				//@ -> 64 Decimal ASCII Value
				
				/*
				 * Subtracting because in alphabet there are 26 letters. 
				 * So we move into beginning of the alphabet.
				 */
				c -= 26;
			}
//			System.out.println("Outside If Condition");
//			int asciiValue = c;  
//			System.out.println("The ASCII value of " + c + " is: " + asciiValue);
//			int res = asciiValue + 2;
//			System.out.println(asciiValue +" + "+2 +" = "+res);
//			
//			char charValue = (char) res;  
//			System.out.println("The Char value of " + res + " is: " + charValue);
			
			// 63 + 2 = 65 Decimal ASCII Value -> Character A
			// 64 + 2 = 66 Decimal ASCII Value -> Character B
			c += 2; 
			newWord += c; 			
		}
		System.out.println(newWord);
	}

	public static void main(String[] args) {
		asciiTable();
		getString("Simply");
		getString("Owz");

	}

}
