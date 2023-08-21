package com.raghib.b.word.newstring;

//QUESTION - Take a sentence and change case of each alternate word.

public class ChangeCase {
	
	public static void getString(String str) {
		String word = "";
		String newString = "";
		int count = 0;
		str += " ";	//Add one space at the end of string.
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				word += c;
			} else {
				if(count++%2 == 0) {
					newString = newString +word.toUpperCase() +" ";
				} else {
					newString = newString +word.toLowerCase() +" ";
				}
				word = "";	//Over write the word with space.				
			}
		}
		System.out.println("After Case Change : "+newString);
		
	}

	public static void main(String[] args) {
		getString("a RED Seed oNLY");
	}
}
