package com.raghib.c.word.print;

//QUESTION - Print only the words containing E in a sentence.

public class PrintOnlyWordsWhichContainLetterE {
	
	public static void getString(String str) {
		String word = "";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.contains("E"))
					System.out.println(word);
				word = "";	//Over write the word with space.
			}
		}
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
	}

}
