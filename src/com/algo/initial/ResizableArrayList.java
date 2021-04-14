package com.algo.initial;

import java.util.ArrayList;

public class ResizableArrayList {

	public static void main(String[] args) {
	ArrayList<String> arrLst=new ArrayList<>();
	
	String arr[]= {"hi","how","are,you"};
	
	
	String arr1[]= {"i","am","fine","vijay"};
	
	
	
	for(String arrItem:arr) {
		arrLst.add(arrItem);
	}
	arrLst.add(" ");
	
	for(String arrItem1:arr1) {
		arrLst.add(arrItem1);
	}
	
	for(String s:arrLst) {
		System.out.print(s);
	}
	
	
	
	StringBuilder strBld=new StringBuilder();
	for(String w:arrLst) {
		strBld.append(w);
	}
	
	System.out.println(strBld.toString());
	}
	
}
