package com.algo.initial;

import java.util.Arrays;

public class KTHMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {4, 5, 1, 2};
		
		Arrays.sort(arr1);
		int k=3;
		System.out.println(arr1[k-1]);
		
		int arr2[] = {4, 5, 1, 2};
		
		//3 
		for(int i=0;i<arr2.length-1;i++) {
			
			for(int j=i;j<arr2.length-1;j++) {
				
		
				
				if(arr2[i]>arr2[j+1]) {
					int temp=arr2[i];
					arr2[i]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}

}
