package com.raghib.c.word.print;

//QUESTION - Print all special words in a String. Example - Anna, bob etc.

public class PrintAllSpecialWords {

	public static void getString(String str) {
		String word = "";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				char firstCharacter = word.charAt(0);
				char lastCharacter = word.charAt(word.length()-1);
				if(Character.toUpperCase(firstCharacter) == Character.toUpperCase(lastCharacter))
					System.out.println(word);
				word = "";	//Over write the word with space. 
			}
		}
	}	

	public static void main(String[] args) {
		getString("Mom Or DaD oo rr");
	}

}
