package com.raghib.a.character.count;

import java.util.HashMap;
import java.util.Map;

public class IgnoreSpaceThenCountCharacter {

	public static void countEachCharacter(String str) {
		Map<Character, Integer> hmObj = new HashMap<Character, Integer>();
		String removeSpaceStringValue = str.replaceAll("\\s", "");
		char charArray[] = removeSpaceStringValue.toCharArray();
		for (char c : charArray) {
			if (hmObj.containsKey(c)) {
				hmObj.put(c, hmObj.get(c) + 1);
			} else {
				hmObj.put(c, 1);
			}
		}
		System.out.println(str + " : " + hmObj);
	}

	public static void main(String[] args) {
		countEachCharacter("test");
		countEachCharacter(" test ");
		countEachCharacter("test test");
		countEachCharacter("Test tEst");
	}

}
