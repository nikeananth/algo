package com.algo.initial;

public class Coefcient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 10, 15 }; 
		int res=0;
		int res1=0;
		for(int i=0;i<arr.length;i++) {
			
			   res=Math.max(res,arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			
			   res=Math.min(res,arr[i]);
		}
		
		float cof=(res-res1)/(res+res1);
		System.out.println(cof);
	}

}
