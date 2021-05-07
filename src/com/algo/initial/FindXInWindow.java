package com.algo.initial;

public class FindXInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,3,22,3,2,33,2,3};
		int arr1[]= {12,3,22,3,2,33,2,3};
		int arr2[]= {1,2,4,4};
		findXwindow(arr2,3);
		
	}

	private static void findXwindow(int[] arr, int w) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		int k=w;
		
		int count=0;
		for(int i=0;i<n;i=i+k) {   //3   
 			
			for(int j=i;j<i+k;j++) { // 3;j<3+3
				
				
				if(j<n&&arr[j]==3) {
					count++;
					break;
				}

			}
			System.out.println(count);
			    
			
		}
		
		
	}

}
