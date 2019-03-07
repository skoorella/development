package com.java.stringreverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t!=0)
		{
		 String str = sc.next();
		 System.out.println(reverseWithoutAffectingSpecialChars(str));
		 t=sc.nextInt();
		}
	}
	
	public static String reverseWithoutAffectingSpecialChars(String input) {
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
			reverseString.insert(key, splCharMap.get(key));
		}
		
		return reverseString.toString();
	}

}