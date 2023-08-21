package com.raghib.string.reverse;

//Program to reverse the string word by word.

/**
*
 * Input: Before Reverese Word By Word : I am a bad boy
 * Output: After Reverese Word By Word : I ma a dab yob
*
*/ 

public class ReverseWordByWord {
	public static String sentence = "";
	public static String resultString = "";
	
	public static void main(String[] args) {
		sentence = "I am a bad boy";		
		resultString = reverseWordByWord(sentence);
		System.out.println("Before Reverese Word By Word : " + sentence);
		System.out.println("After Reverese Word By Word : " + resultString);	
	}

	public static String reverseWordByWord(String inputString) {
		String rev = "";
		String wordArrays[] = inputString.split("\\s");
		for (String w : wordArrays) {
			StringBuffer sb = new StringBuffer(w);
			StringBuffer reverseString = sb.reverse();
			rev += reverseString.toString() + " ";
		}
		return rev;
	}
}
