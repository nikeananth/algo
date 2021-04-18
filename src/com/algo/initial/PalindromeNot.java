package com.algo.initial;

public class PalindromeNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="civics";
		
	    int a='a';
	    int z='z';
	    

	    
	    int count=z-a;

	    int data[]=new int[count+1];
	    
	    char ch[]=str.toCharArray();
	    
	    for(int i=0;i<str.length();i++) {
	    	
	    	int x=z-ch[i];
	    	
	    	data[x]=++data[x];
	    	
	    	
	    }
	    	
	    int oddcount=0;
	    for(int data1:data) {
	    	if(data1 % 2==0) {
	    		
	    	}
	    	else {
	    		oddcount++;
	    	
	    	}
	    }
	    
	    if(oddcount>1) {
	    	System.out.println("not palindrom");
	    }
	    
	    
		
	}

}
