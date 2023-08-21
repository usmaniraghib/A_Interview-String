package com.raghib.b.word.newstring;

//QUESTION - Write a program to captilize first letter of each word in a sentence. 

public class CaptilizeFirstLetterOfEachWordInASentence {
	
	public static void getString(String str) {
		String word = "";
		String newString = "";
		str += " ";	//Add one space at the end of string.
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				char newChar = word.charAt(0);
				newChar = Character.toUpperCase(newChar);
				newString += newChar +word.substring(1) +" "; 				
				word = "";	//Over write the word with space.				
			}
		}
		System.out.println("After Captilize First Letter Of Each Word In A Sentence : "+newString);
		
	}

	public static void main(String[] args) {
		getString("a red seed");
	}

}
