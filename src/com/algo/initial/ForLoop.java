package com.algo.initial;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arrayA[]= {1,2,3,4,5};
		
		int arrayB[]= {5,4,3,2,1};
		
		for(int i=0;i<arrayA.length;i++) {
			
			for(int j=i;j<arrayB.length;j++) {
				
				System.out.println("i"+arrayA[i]+",j"+arrayB[j]);
				break;
				
			}
		}
	}

}
