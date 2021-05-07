package com.algo.initial;

public class SumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7, -1, 5 };
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==6) {
                    
					System.out.println(arr[i]+""+arr[j]);
				}
			}
		}
	}

}
