package com.algo.initial;
/* Java implementation of simple method to find count of
pairs with given sum*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Test {
	static int arr[] = new int[] { 1, 5, 7, -1, 5 };

	// Returns number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	static int getPairsCount(int n, int sum)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();

		for(int i=0;i<arr.length;i++) {

		    hm.put(arr[i], i);
					
		}
		
		for(int i=0;i<arr.length;i++) {

	   int data=sum-arr[i];
	   
	           if(hm.get(data) != null ) {
	        	   System.out.println("paired"+hm.get(data)+""+arr[i]);
	        	   
	           }
					
		}
		
		
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
		    if(set.contains(sum-arr[i])) {
		            
		    	System.out.println(arr[i]);
		    	
		    }
		    else {
		    	set.add(arr[i]);
		    }
		}
		
		return 1;
	}

	// Driver method to test the above function
	public static void main(String[] args)
	{

		int sum = 6;
		System.out.println(
			"Count of pairs is "
			+ getPairsCount(arr.length, sum));
	}
}
// This code is contributed by Gaurav Miglani
