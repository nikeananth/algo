package com.algo.initial;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(sum(5));
	}

	
	static int sum(int n) {
		
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
}
