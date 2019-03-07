package com.java.stringreverse;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String args[]){
		StringReverse reverse = new StringReverse();
		
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t!=0)
		{
		 String str = sc.next();
		 System.out.println(reverse.reverseWithoutAffectingSpecialChars(str));
		}
//		String s = "abc$defgh!i";
////		System.out.println(s);
////		System.out.println(reverse.reverseWithoutAffectingSpecialChars(s));
//		s = "(x$l$`ek]$intly$l$ysbzatm$gh^jjdzb$s]`zg$hrxy(fe$(y";
//		System.out.println(s);
//		System.out.println(reverse.reverseWithoutAffectingSpecialChars(s));		
	}

}
