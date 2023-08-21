package com.raghib.a.word.count;

//QUESTION - Count the number of words in a sentence.

public class CountNumberOfWordsInSentence {
	
	public static void getString(String str) {
		String word = "";
		int count = 0;		
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				count++;
				word = "";	//Over write the word with space.
			}			
		}
		System.out.println("Word : "+str);
		System.out.println("No Of Words : "+count);	
		System.out.println("");
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
		getString("Mom Or DaD");
		getString("Mor DaD");
	}
}
