package com.algo.initial;
// Java program to find missing Number
import java.util.Arrays;
import java.util.*;
class GFG{
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		//1,2,2,3,1
		for(int i=0;i<nums.length;i++) {
			     int index=Math.abs(nums[i]);//0,1,2,3,4,5
			          
			            if(nums[index-1]>0) {
			            	nums[index-1]*=-1;
			            }			            				
		}
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			//System.out.println(nums[i]);
			if(nums[i]>0) {
				System.out.println(i+1);
			}
			
		}

		return null;
	}
	
	
	
	public static void main(String[] args) {
	int [] a ={1,2,3,5};
	//findDisappearedNumbers(a);
	int x1 = a[0];
    for (int i = 1; i < a.length; i++)
        x1 = x1 ^ a[i];
    
    
	int total=0;
	int totc=0;
	for(int i=1;i<=a.length;i++) {
		total=total+i;
		
		totc=totc+a[i-1];
	}
	total=total+a.length+1;
	System.out.println(total);
	System.out.println(totc);
	
	System.out.println(total-totc);
	
	
	}
}
