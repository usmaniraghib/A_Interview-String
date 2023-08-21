package com.raghib.a.character.count;

import java.util.HashMap;
import java.util.Map;

public class CountCharatcer {
	public static void countEachCharacter(String stringValue) {
		Map<Character, Integer> hmObj = new HashMap<Character, Integer>();
		char charArray[] = stringValue.toCharArray();
		for (char c : charArray) {
			if (hmObj.containsKey(c)) {
				hmObj.put(c, hmObj.get(c) + 1);
			} else {
				hmObj.put(c, 1);
			}
		}
		System.out.println(stringValue + " : " + hmObj);
	}

	public static void main(String[] args) {
		countEachCharacter("test");
		countEachCharacter(" test ");
		countEachCharacter("test test");
	}
}
