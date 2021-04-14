package com.algo.initial;

import java.util.Arrays;

public class StringPermOfOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="dog";
		String s2="god";
	//	extracted();
		
		int char_set[]=new int[128];
		
		for(int i=0;i<s1.length();i++) {
			 char_set[s1.charAt(i)]++;
		}
		
		
		for(int i=0;i<s1.length();i++) {
			 char_set[s1.charAt(i)]--;
			 if(char_set[s1.charAt(i)]<0) {
			System.out.println("sorry");
			 }
			 
			 
			 
		}
		System.out.println("cool");
		
		
		
	}

	private static void extracted() {
		String s1="dog";
		String s2="god";
		
	    if(s1.length()!=s2.length()) {
	    	System.out.println("not equal");
	    }
	    char ch1[]=s1.toCharArray();
	    char ch2[]=s2.toCharArray();
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
	   
	   
	    if(String.valueOf(ch1).equals(String.valueOf(ch2))) {
	    	System.out.println("equal");
	    }
	}

}
