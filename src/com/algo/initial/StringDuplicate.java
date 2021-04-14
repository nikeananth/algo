package com.algo.initial;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(uniqueChars("vijay"));
		
		String str="vijay";
		int checker=0;
		
		for(int i=0;i<str.length();i++) {
			
			     int charIntValue=str.charAt(i)-'a';
			     
			     int bitVector = 1<<charIntValue;
			     
			    if((checker & bitVector) >0) {
			        System.out.println("duplicate found");
			    }
			    else {
			    	
			    	checker=checker | bitVector;
			    	
			    }
			    
			     
			
		}
		
		
		
	}
	
	static boolean uniqueChars(String str) {
		
		if(str.length()>128) {
			return false;
		}
		
	  boolean char_set[]=new boolean[128];
	  
	  for(int i=0;i<str.length();i++) {
		  
		  int index=str.charAt(i);
		  
		  if(char_set[index]==true) {
			  return false;
		  }
		  
		  char_set[index]=true;
		  		  
	  }
		
		
	  return true;

		
	}

}
