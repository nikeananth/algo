package com.algo.initial;

public class PermutString {

	
	public static void main(String[] args) {
		
		String str="ABCD";
		permutation(str,0);
	}
	
 public static void permutation(String str,int l) {
	 
	 
	 if(l==str.length()) {
		 System.out.println(str);
	 }
	 
	 for(int i=l;i<str.length();i++) {
		 
		 str=swap(i,l,str);
		 permutation(str,l+1);
		 str=swap(i,l,str);
	 }
	 
 }

private static String swap(int i, int l, String str) {
	
	char a[]=str.toCharArray();
	char temp=a[i];
	a[i]=a[l];
	a[l]=temp;
	return String.valueOf(a);

	// TODO Auto-generated method stub	
}
	
}
