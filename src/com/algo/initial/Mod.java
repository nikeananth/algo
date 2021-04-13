package com.algo.initial;

public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //11*2=1
    	
		System.out.println(extracted(13,2));
    		   
	}

	private static int extracted(int a,int b) {

		if(b<=0) {
			return -1;
		}
		int div=a/b;
		 int mod=a-div*b;
		return mod;
	}

}
