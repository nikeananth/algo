package com.algo.initial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	  int fact=1;
	  
	  for(int i=1;i<=5;i++) {
		  fact=fact*i;
	  }
	  System.out.println(fact);
	   
	
	recursive(5);



	 }

	private static int recursive(int n) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			return 1;
		}
			
		return n*recursive(n-1);
		
	}

	      

}
