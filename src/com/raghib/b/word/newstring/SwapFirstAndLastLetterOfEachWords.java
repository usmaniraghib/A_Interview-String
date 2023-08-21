package com.raghib.b.word.newstring;

//QUESTION - Write a program to swap first and the last letter of each word of a sentence. 

public class SwapFirstAndLastLetterOfEachWords {
	
	public static void getString(String str) {
		String word = "";
		String newString = "";
		String middle = "";
		str += " ";	//Add one space at the end of string.
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				char firstChar = word.charAt(0);
				//System.out.println("First Char : "+firstChar);
				char lastChar = word.charAt(word.length()-1);
				//System.out.println("Last Char : "+lastChar);
				if(word.length() > 1) {
					middle = word.substring(1,word.length()-1);
					//System.out.println("Middle Chars : "+middle);
					newString += lastChar + middle + firstChar + " ";
				} else {
					newString += firstChar + " ";	//This statement for Single character in a sentence.
				}
				word = "";	//Over write the word with space.				
			}
		}
		System.out.println("After Captilize Each Word In A Sentence : "+newString);
		
	}

	public static void main(String[] args) {
		getString("In the box");
		getString("a red seed");
		getString("a r s");
	}

}
