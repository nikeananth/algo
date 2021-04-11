package com.algo.initial;

public class SumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		int product=1;
		
		int array[]={10,9,1,8,2,3};
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		for(int i=0;i<array.length;i++) {
			product*=array[i];
		}
		
		System.out.println(sum+"sum and product"+product);
	}

}
