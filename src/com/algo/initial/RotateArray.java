package com.algo.initial;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[]{1, 2, 3, 4, 5};
		
		
	   int l=arr.length;
	   int x=arr[l-1];
	   
	   for(int i=arr.length-1;i>0;i--) {
		   
		   arr[i]=arr[i-1];
		   
		   
	   }
	   
	   arr[0]=x;
	   
	   System.out.println(Arrays.toString(arr));
	   
	   
	}

}
