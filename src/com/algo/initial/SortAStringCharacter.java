package com.algo.initial;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortAStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="vijay";
		char ch[]=s.toCharArray();
		
		Character tempArray[]=new Character[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			tempArray[i]=ch[i];
		}
		
	    Arrays.sort(tempArray,new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
			}
		});
	    
	    StringBuilder sb=new StringBuilder();
	    for(Character ch1:tempArray) {
	    	sb.append(ch1);
	    }
	    
	    System.out.println(sb.toString());
	}
	
	

}
