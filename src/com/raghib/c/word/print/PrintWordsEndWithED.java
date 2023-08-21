package com.raghib.c.word.print;

//QUESTION - Print only the words ending with ED in a sentence.

public class PrintWordsEndWithED {
	
	public static void getString(String str) {
		String word = "";
		System.out.println("word length : "+word.length());
		System.out.println("str length before assignment : "+str.length());
		str += " ";	//Add one space at the end of string.
		System.out.println("str length after assignment : "+str.length());
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.endsWith("ED"))
					System.out.println(word);
				word = "";	//Over write the word with space.
			}
		}
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
	}

}
