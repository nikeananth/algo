package com.algo.initial;

import java.util.HashMap;
import java.util.Map;

public class IntegerFrequency {

	
	public static void main(String[] args) {
		int a[] = {0, 5, 5, 5, 4};
		Map<Integer,Integer> map=new HashMap<>(); 
		 
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i]))
					{
				map.put(a[i], map.get(a[i])+1);
					}
			else {
				map.put(a[i] , 1);
			}
		}
		System.out.println(map.get(5));
		//extracted(); 
	}

	private static void extracted() {
		int a[] = {0, 5, 5, 5, 4};
		int count=0;
		 for (int i=0; i < a.length; i++) {
			
			 if(a[i]==5) {
				 count++;
			 }
		 }
		 System.out.println(count);
	}
}
