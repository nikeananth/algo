package com.algo.initial;

import java.util.Arrays;

public class SortZerosOnes {

	public static void main(String args[]) {
		
		int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		int low=0;
		int high=arr.length;
		int mid=(low+high)/2;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				arr[low]=arr[i];
				low++;
			}
			else if(arr[i]==2) {
				arr[high-1]=arr[i];
				high--;
			}
		}
		for(int i=low;i<high;i++) {
			arr[i]=1;
		}
		  System.out.println(Arrays.toString(arr));
		
		//extracted(arr);
		
	}

	private static void extracted(int[] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<arr.length;i++) {
			
			switch(arr[i]) {
			
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
				
			}
		}
			int i=0;
		  while(count0>0) {
			  arr[i++]= 0;
			  count0--;
		  }
		  while(count1>0){
			  arr[i++]=1;
			  count1--;
		  }
		  while(count2>0) {
			  arr[i++]=2;
			  count2--;
		  }
	  
		  System.out.println(Arrays.toString(arr));
	}
}
