package com.algo.initial;

import java.util.Arrays;

public class MaxAndMin1 {
	
	public static void main(String[] args) {
		
		  int arr[] = { 12, 1,2,34, 45, 67, 1 };
		  
		  int MAX=Integer.MIN_VALUE;//-1111
		  int MIN=Integer.MAX_VALUE;//9999999
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  if(arr[i]>MAX) { 
				  MAX=arr[i];
			  }
			  else if(arr[i]<MIN) {
				  MIN=arr[i];
			  }
		  }
		  
		  System.out.println(MAX+""+MIN);
		  int MAX1=Integer.MIN_VALUE;//-1111
		  int MIN2=Integer.MAX_VALUE;//9999999
		  
		  for(int i=0;i<arr.length;i++) {
			  MAX1=Math.max(MAX1, arr[i]);
		  }
		  
		  for(int i=0;i<arr.length;i++) {
			  MIN2=Math.min(MIN2, arr[i]);
		  }
		  System.out.println(MAX1+""+MIN2);
		  
		  System.out.println(getMax(arr,0,arr.length));
		  System.out.println(getMin(arr,0,arr.length));
		  
		  System.out.println(Arrays.stream(arr).min().getAsInt());
	}
	
	
	
	static int getMax(int arr[], int i, int n) {
		
		if(n==1) {
			return arr[i];
		}
		
		return Math.max(arr[i], getMax(arr,i+1,n-1));
		
}
	
	static int getMin(int arr[], int i, int n) {
		
		if(n==1) {
			return arr[i];
		}
		
		return Math.min(arr[i], getMin(arr,i+1,n-1));
		
}

}
