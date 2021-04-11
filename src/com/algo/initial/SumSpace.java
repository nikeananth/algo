package com.algo.initial;

public class SumSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		for(int i=1;i<=5;i++) {
			add(sum, i);
		}
		
		System.out.println(sum);
	}
	
	
	static int add(int sum,int i) {
		return sum+i;
	}
	
	

}
