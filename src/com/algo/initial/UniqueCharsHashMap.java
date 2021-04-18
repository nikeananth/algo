package com.algo.initial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		Map<Character,Integer> seen=new HashMap<Character,Integer>();
		
		
		for(int i=0;i<input.length();i++) {
			
			if(Character.isAlphabetic(input.charAt(i))) {
				
				if(seen.containsKey(input.charAt(i))) {
					
					seen.put(input.charAt(i), (seen.get(input.charAt(i))+1));
				}
				else {
					seen.put(input.charAt(i), 1);
				}				
			}			
		}
		
		
		for( Map.Entry<Character,Integer> entry: seen.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
						
		}
		
		
		
		
	}

}
