package com.raghib.a.word.count;

//QUESTION - Find the longest word in a sentence.

public class LongestWordInSentense {
	
	public static void getString(String str) {
		String word = "";
		String longestWord = "";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.length() > longestWord.length())
					longestWord = word;
				word = "";	//Over write the word with space.
			}
		}
		System.out.println("Sentence : "+str);
		System.out.println("Longest Word : "+longestWord);
		System.out.println("");
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
		getString("Mom Or DaD");
	}

}
