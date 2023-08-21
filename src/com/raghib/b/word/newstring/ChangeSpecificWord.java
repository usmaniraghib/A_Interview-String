package com.raghib.b.word.newstring;

//QUESTION - Change RED with BLUE in a sentence and print it.

public class ChangeSpecificWord {
	
	public static void getString(String str) {
		String word = "";
		String newString = "";
		str += " ";	//Add one space at the end of string.
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(word.equals("RED")) {
					newString = newString +"BLUE" +" ";
				} else {
					newString = newString +word +" ";
				}
				word = "";	//Over write the word with space.			
			}
		}
		System.out.println("After Word Change : "+newString);
		
	}

	public static void main(String[] args) {
		getString("A RED SEED");
	}
}
