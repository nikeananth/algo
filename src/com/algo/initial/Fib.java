package com.algo.initial;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
		System.out.println(iteratrive(5));
	}

	
	public static int fib(int n) {
		
		if(n<=0) {
			return 0;
		}
		
		if(n==1)
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static int iteratrive(int n) {
		
		int counter =0;
		int num1=0;
		int num2=1;
		int num3=0;
		while(counter < n ) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			counter++;
		}
		
		return 0;
		
	}
}



