package com.algo.initial;

public class BinarySearchOriginal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int array[]= {1,2,3,4,5,6,7,8,9};
   
   int found=binarySearch(array,0,array.length);
   System.out.println(found);
   
	}

	private static int binarySearch(int[] array,int min,int max) {
		// TODO Auto-generated method stub
		
		int mid=(min+max)/2;
		if(min>=max) {
			return -1;
		}
		if(array[mid]==10) {
			return 5;
		}
		else if(10<array[mid]){
			return binarySearch(array,min,mid-1); 
		}
		else if(10>array[mid]){
			return binarySearch(array,mid+1,max); 
		}
		System.out.println("sdsd");
		return -1;
	}
	
	

}
