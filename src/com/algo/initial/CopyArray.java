package com.algo.initial;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,4,5,5};
		copyArray(a);
		
		

	}
	
	static int[] copyArray(int array[]) {
		
		int[] newArray=new int[array.length+1];
		int i=0;
	for(int value:array) {
		newArray[i]=value;
		i++;
	}
	
	System.out.println(newArray.length);
		
		
		//todo
		return new int[10];
	}

	
}
