package com.algo.initial;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=25;
        boolean isPrime=false;
		for(int x=2;x<=Math.sqrt(n);x++) {
			System.out.println(n%x);
			if(n%x==0) {
		      		System.out.println("is not prime");
		      		isPrime=true;
		      		break;
			}
			
		
		}
		
		if(!isPrime) {
			System.out.println("is prime no");
		}
			
	}

}
