package com.algo.initial;

public class Subsquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String	str1 = "AXY", str2 = "ADXCPY";
	
	int j=0;
	
	for(int i=0;i<str2.length();i++) {
		if(str1.charAt(j)==str2.charAt(i)) {
			j++;
		}
	}
	if(j==str1.length()){
		System.out.println("is a subsequence");
	}
		
	}

}
