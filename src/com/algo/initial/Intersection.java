package com.algo.initial;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        int i,j=0;
        for( i=0,j=0;i<arr1.length&&j<arr2.length;) {
        	
        	if(arr1[i]==arr2[j]) {
        		System.out.println("inter"+arr1[i]);
        	}
        	if(arr1[i]<=arr2[j]) {
        		System.out.println(arr1[i]);
        		i++;
        		
        	}
        	else if(arr2[j]<=arr1[i]) {
            	 System.out.println(arr2[j]);
            	 j++;
             }                                  	
        }
        
        while(i<arr1.length) {
        	System.out.println(arr1[i]);
        	i++;
        }
        while(j<arr2.length) {
        	System.out.println(arr2[j]);
        	j++;
        }
        
	}

}
