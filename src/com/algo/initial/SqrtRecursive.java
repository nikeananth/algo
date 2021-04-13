package com.algo.initial;

public class SqrtRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=25;	
		
		System.out.println(sqrt_helper(n,1,n));
		

		for(int i=0; i*i<=n;i++) {
			
			if(i*i==n) {
				System.out.println(i);
			}
			
		}
		
	}

	private static int sqrt_helper(int n, int min, int max) {
		// TODO Auto-generated method stub
		
		if(max<min) {
			return -1;
		}
		
		int guess=(min+max)/2;
		if(guess*guess==n) {
			return guess;
		}		
		else if(guess*guess<n) {
			return sqrt_helper(n,guess+1,max);
		}else {
			return sqrt_helper(n, min,guess-1);
		}		
	}
	
	

}
