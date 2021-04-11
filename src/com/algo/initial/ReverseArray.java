package com.algo.initial;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[]= {9,8,7,6,5,4,3,2,1};
		
		for(int i=0;i<array.length/2;i++) {
			
			extracted(array, i);
		}
		
		for(int arr:array) {
			System.out.print(arr);
		}

	}

	private static void extracted(int[] array, int i) {
		int other=array.length-1-i;		
		int temp=array[i];
		array[i]=array[other];
		array[other]=temp;
	}

}
