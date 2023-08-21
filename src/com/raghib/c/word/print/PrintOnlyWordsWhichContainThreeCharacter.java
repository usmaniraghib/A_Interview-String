package com.raghib.c.word.print;

//QUESTION - Print only the words which contains 3 character in a sentence.

public class PrintOnlyWordsWhichContainThreeCharacter {
	
	public static void getString(String str) {
		String word = "";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.length() == 3)
					System.out.println(word);
				word = "";	//Over write the word with space.
			}
		}
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
	}

}
