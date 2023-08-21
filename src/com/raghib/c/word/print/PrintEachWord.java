package com.raghib.c.word.print;

// QUESTION - Print each word of a sentence in a separate line.

public class PrintEachWord {
	
	public static void getString(String str) {
		String word = "";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;				
			} else {
				System.out.println(word );
				word = "";	//Over write the word with space. 
			}
		}
	}

	public static void main(String[] args) {
		getString("IN THE BOX");
	}

}
