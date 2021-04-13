package com.algo.initial;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LongestSubString("KPEWKKPWMDSD"));
	}
	
	
	public static int LongestSubString(String s) {

		int i=0;
		int j=0;
		int max=0;
		Set<Character> set=new HashSet<Character>();
		//KPEWKKPWMDSD
		if(s==null || s.length()==0) {
			return -1;
		}
		while(i<s.length()) {
			
		
			char ch=s.charAt(i);
			while(set.contains(ch)) {
				set.remove(s.charAt(j));
				j++;
			}
			
			set.add(ch);
			max=Math.max(max, i-j+1);
			i++;

		}
		
		
		
		
		
		
		
		return max;
	}

}
