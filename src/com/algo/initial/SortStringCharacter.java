package com.algo.initial;

import java.util.Arrays;

public class SortStringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     extractedToArray();
     
     String s="vijay";
	 char a[]=s.toCharArray();
	 
	 
	 char v='v';
	 char k='i';
	 
	 if(v>k) {
		 System.out.println("sss");
	 }
		/*
		 * for(int i=0;i<a.length-1;i++) { for(int j=1;j<a.length;j++) { if(a[i]>a[j]) {
		 * char temp=a[i]; a[i]=a[j]; a[j]=temp; }
		 * System.out.println(String.valueOf(a)); }
		 * 
		 * }
		 */
	 
	 System.out.println(String.valueOf(a));
	}

	private static void extractedToArray() {
		String s="vijay";
		 char a[]=s.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
	}

}
