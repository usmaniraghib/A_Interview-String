package com.raghib.a.word.count;

//QUESTION - Count the number of words ending with D in a sentence.

public class CountNumberOfWordsInSentenceWithParticularLetter {

	public static void getString(String str) {
		String word = "";
		int count = 0;	
		String searchLetter = "D";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.endsWith(searchLetter))
					count++;
				word = "";	//Over write the word with space.
			}			
		}
		System.out.println("Sentence : "+str);
		System.out.println("Letter to search in sentence is : "+searchLetter);
		System.out.println("No Of Words : "+count);		
	}	

	public static void main(String[] args) {
		getString("A RED SEED");		
	}
}
