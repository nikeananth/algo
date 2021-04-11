package com.algo.initial;

public class FibMemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fib(5,new int[5+1]);
	}
	
	
	
	
	static int fib(int n,int memo[]) {
		
		if(n<=0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else if(memo[n]>0) {
			return memo[n];
		}
		
		memo[n]=fib(n-1,memo)+fib(n-2,memo);
		return memo[n];
		
		
		
	}

}
