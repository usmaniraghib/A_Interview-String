package com.raghib.a.word.count;

//QUESTION - Find if the word "OR" exists in a string or not.

public class FindWord {
	
	public static void getString(String str) {
		String word = "";
		int count = 0;	
		String searchWord = "OR";
		str += " ";	//Add one space at the end of string.
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.equalsIgnoreCase(searchWord))
					count++;
				word = "";	//Over write the word with space.
			}			
		}
		if (count == 0) {
			System.out.println("Sentence : "+str);
			System.out.println("THE WORD "+searchWord+" NOT FOUND");	//A RED SEED, Mor DaD		
		} else {
			System.out.println("Sentence : "+str);
			System.out.println("THE WORD "+searchWord+" FOUND");	//Mom Or DaD
		}
		System.out.println("");
	}	

	public static void main(String[] args) {
		getString("A RED SEED");
		getString("Mom Or DaD");
		getString("Mor DaD");
	}

}
