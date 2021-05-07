package com.algo.initial;

public class MinAndMax {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		int[] array= {10,9,1,8,2,3};
         
		for(int arr:array) {
			if(arr<min) {   
				min=arr;
				
			}
			else if(arr>max) {
				max=arr;
			}
		}
		
		System.out.println("min"+min);
		System.out.println("max"+max);
	}
	
	

}
