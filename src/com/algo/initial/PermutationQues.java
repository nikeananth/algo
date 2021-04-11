package com.algo.initial;

public class PermutationQues {

	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		printPermuations("abcd","");
		
	}
	
	public static void printPermuations(String ques,String asf) {
		
		
		if(ques.length()==0) {
			System.out.println(asf);
		}
		
		for(int i=0;i<ques.length();i++) {
			
			char ch=ques.charAt(i);
			
			String lpart=ques.substring(0, i);
			String rpart=ques.substring(i+1);
			String fin=lpart+rpart;
			printPermuations(fin,ch+asf);
		}
	}
   
}
