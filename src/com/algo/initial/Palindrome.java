package com.algo.initial;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str1="civic";
		
		String str2="civics";
		
		int ch1[]=new int[128];
		
		for(int i=0;i<str1.length();i++) {
			  int index =str1.charAt(i)-'a';
			  ch1[index]=++ch1[index];
		}
		
		

		for(int i=0;i<str2.length();i++) {
			  int index =str2.charAt(i)-'a';
			  ch1[index]=--ch1[index];
			  
			  if(ch1[index]<0) {
				  System.out.println("oops");
			  }
		}
		
		
		
		
		
		//extracted(str1, str2);
		
	}

	private static void extracted(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("not palindrome");
		}
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		String s=String.valueOf(ch1);
		String sm=String.valueOf(ch2);
		if(s.equals(sm)) {
			System.out.println("its palindrome");
		}
	}

}
