package com.algo.initial;

import java.util.HashMap;

public class LongestSubUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Character,Integer> map=new HashMap<>();
		
		int max=0;
		
		int start=0;
		String s="geeksforgeeks";
		for(int end=0;end<s.length();end++) {
			
			
			if(map.containsKey(s.charAt(end))) {
				start=Math.max(start, map.get(s.charAt(end))+1);
			}
			
			map.put(s.charAt(end), end);
			 max = Math.max(max, end-start + 1);
			
		}
		
				
		
		
	}

}
