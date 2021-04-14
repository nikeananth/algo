package com.algo.initial;

public class SubSequenceRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "gksrek";
        String str2 = "geeksforgeeks";
		int m=str1.length();
		int n=str2.length();
		
		System.out.println(isSubsequence(str1,str2,m,n));
		
	}

	private static boolean isSubsequence(String str1, String str2, int m, int n) {
		// TODO Auto-generated method stub
		
		if(m==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		
		if(str1.charAt(m-1)==str2.charAt(n-1)) {
			return isSubsequence(str1, str2, m-1, n-1);
			
		}
		else {
		   return	isSubsequence(str1, str2, m, n-1);
		}
		
	}

}
