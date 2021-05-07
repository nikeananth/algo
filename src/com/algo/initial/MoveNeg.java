package com.algo.initial;

import java.util.Arrays;

public class MoveNeg {

	
	public static void main(String[] args) {
		
		int i=0;
		int temp=0;
		
		   int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		   
		   int low=0;
		   int high=a.length-1;
		   
		   while(low<high) {
			   if(a[i]<0) {
				   a[low]=a[i];
				   low++;
			   }
			   else {
				   a[high]=a[i];
				   high--;
			   }
			   i++;
			   
		   }
		   
			System.out.println(Arrays.toString(a));
		   
		//brute(a);
	}

	private static void brute(int[] a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
