package com.algo.initial;

import java.util.HashMap;

public class LongestSubStringN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     //   n2();
	//	n();
		String str="vijayananth";
		HashMap<Character,Integer> seen=new HashMap<>();
		
		int max=0;
		
		int start=0;
		
		
		for(int end=0;end<str.length();end++) {
			
			if(seen.containsKey(str.charAt(end))) {
			start= Math.max(start, str.charAt(end)+1);
			}
			
			seen.put(str.charAt(end), end);
			max=Math.max(max,end-start+1);
			
			
			
		}
		
		System.out.println(max);
		
		
	
		
	}

	private static void n() {
		String str="vijayananth";
		boolean visited[]=new boolean[256];
		
		int res=0;
		
		//int i=0;
		int j=0;
		int k=0;
		for(int i=0;i<str.length();i++) {
		 
			if(visited[str.charAt(i)]) {
				j=i;
			}
			else {
				visited[str.charAt(i)]=true;
				res=Math.max(res, i-j+2);
			}
			
		}
		
		System.out.println(res);
	}

	private static void n2() {
		int res = 0;
		String str="geeksforgeeks";
		
		for(int i=0;i<str.length();i++) {
			
			boolean visited[]=new boolean[256];
			
			for(int j=i;j<str.length();j++) {
				
				if(visited[str.charAt(j)]==true) {
					break;
				}else {
					
					res=Math.max(res, j-i+1);
					visited[str.charAt(j)]=true;
					
				}
			}
		}
		
		System.out.println(res);
	}

}
