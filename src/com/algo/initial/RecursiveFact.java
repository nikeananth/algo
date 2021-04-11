package com.algo.initial;

public class RecursiveFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));
		
	}
	
	static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return fact(n-1)+fact(n-1);
	}

}
