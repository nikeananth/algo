package com.algo.initial;

public class PowerOF2 {

	
	public static void main(String[] args) {
	power(25);
	}

	private static int power(int n) {
		// TODO Auto-generated method stub
		if(n<1) {
			return 0;
		}
		if(n==1) {
			System.out.println(1);
			return 1;
		}
		else {
			int data=n/2;
		int prev= power(data);
		int curr=prev*2;
			 System.out.println(curr);
			
			return curr;
		}

	}
	
	
	
}
