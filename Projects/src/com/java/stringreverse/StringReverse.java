package com.java.stringreverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringReverse {

	/**
	 * Input: str = "a,b$c" Output: str = "c,b$a" Note that $ and , are not
	 * moved anywhere. Only subsequence "abc" is reversed Input: str =
	 * "Ab,c,de!$" Output: str = "ed,c,bA!$"
	 * 
	 * @param input
	 * @return
	 */
	public String reverseWithoutAffectingSpecialChars(String input) {
		StringBuffer reverseString = new StringBuffer("");
		Map<Integer, String> splCharMap = new LinkedHashMap<Integer, String>();

		for (int i = input.length() - 1; i >= 0; i--) {
			char s = input.charAt(i);
			if (!Character.isLetterOrDigit(s)) {
				splCharMap.put(i, Character.toString(s));
			}
		}
		for (int i = input.length() - 1; i >= 0; i--) {
			char s = input.charAt(i);
			if (Character.isLetterOrDigit(s)) {
				reverseString.append(s);
			}
		}
		
		List<Integer> reverseOrderedKeys = new ArrayList<Integer>(splCharMap.keySet());
		Collections.reverse(reverseOrderedKeys);
		for (Integer key : reverseOrderedKeys) {
//			System.out.println(key + "-" + splCharMap.get(key));
			reverseString.insert(key, splCharMap.get(key));
		}
		
		return reverseString.toString();
	}
}
