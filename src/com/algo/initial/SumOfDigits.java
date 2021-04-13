package com.algo.initial;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data=1234;
		int sum=0;
		    while(data>0) {
			    sum=sum+data%10;
			    data=data/10;
		    }
		    
		    System.out.println(sum);

	}

}
