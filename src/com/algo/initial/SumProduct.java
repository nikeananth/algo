package com.algo.initial;

public class SumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		sumProduct(a,b);
	}

	private static void sumProduct(int a, int b) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<20;i++) {
			sum=sum+a;
		}
		System.out.println(sum);
	}

}
