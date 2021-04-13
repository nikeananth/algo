package com.algo.initial;

public class CountMatches {

	
	 public static void main(String args[])
	 {
		 String text = "AABCCAAADCBBAADBBC";
		 
		 String arr[]=text.split("AA", -1);
		 for(String s:arr) {
			 System.out.println("s"+s);
		 }
		 
		 System.out.println(text.split("AA", -1).length);
		 
		 
	        String str = "AA";
		   int data= text.indexOf("AA");

		   int counter=0;
		   int indexin=0;
		   while(true) {
			   
			   int index =text.indexOf("AA",indexin);
					   if(index==-1) {
						   break;
					   }
					   else {
						   counter++;
						   indexin=index+2;
					   }
		   }
		   System.out.println(counter);
	 }
}
