package com.algo.initial;

import java.util.Arrays;

public class ReverseArraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4,5,6};
		
		int n=arr.length;
		
		for(int i=0;i<n/2;i++) {
			
			int temp=arr[i];
			
			arr[i]=arr[n-i-1];
			
			arr[n-1-i]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
