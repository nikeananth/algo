package com.algo.initial;

public class NonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 9, 4, 9, 6, 7, 4 };
	        int n = arr.length;
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	int j;
	        	for( j=0;j<arr.length;j++) {
	        		
	        		if(i!=j && arr[i]==arr[j]) {
	        		System.out.println(arr[i]);
	        			break;
	        		}
	        		
	        	}
	            if (j == n)
	            	System.out.println(arr[i]);
	        }
	}

}
