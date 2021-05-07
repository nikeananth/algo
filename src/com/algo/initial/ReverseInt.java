package com.algo.initial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {4, 5, 1, 2};

int temp=0;
int n=arr.length;
for(int i=0;i<arr.length/2;i++)
{
    temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
}
System.out.println(Arrays.toString(arr));


int arr1[] = {4, 5, 1, 2};
rvereseArray(arr1,0,arr.length-1);
System.out.println(Arrays.toString(arr1));
	}
	
	 static void rvereseArray(int arr[], int start, int end)
	    {
		 
		 if(start>=end) {
			 return;
		 }
		int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    rvereseArray(arr,start+1,end-1);
	    
	    }
 

}
