package com.algo.initial;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="aaabbbcccdd";
		
		StringBuilder builder=new StringBuilder();
		int occur=0;
		for(int i=0;i<str.length();i++) {
			occur++;
			
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)) {
				
				builder.append(str.charAt(i));
				builder.append(occur);
				occur=0;
			}
			
		}
		
		System.out.println(builder.toString());
		
		
	}

}
