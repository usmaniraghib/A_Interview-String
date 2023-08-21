package com.raghib.string.reverse;

//Program to reverse the sentence.

/**
 * REFERENCE:-
 * ChatGPT
 * @author Asus
 * 
 * you can split the sentence into words, reverse the order of the words, and then join them back together.
 * 
 * In this example, the reverseSentence method takes a sentence as input, 
 * splits it into words using the space character as the delimiter, 
 * and then iterates over the words in reverse order. 
 * It appends each word to the reversed StringBuilder and adds a space between words 
 * (except for the last word). Finally, it returns the reversed sentence as a String.
 */

/**
*
 * Input: Original Sentence: Hello, how are you?

 * Output: Reversed Sentence: you? are how Hello,
*
*/ 

public class ReverseSentence {
	public static String sentence = "";
	public static String reversedSentence = "";

	public static void main(String[] args) {
		sentence = "Hello, how are you?";
		reversedSentence = reverseSentence(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);		
	}

	public static String reverseSentence(String inputString) {
		String[] words = inputString.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }        
        return reversed.toString();
	}
}
