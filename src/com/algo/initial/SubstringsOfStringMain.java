package com.algo.initial;
 
class SubstringsOfStringMain
{
 public static void main(String args[])
 {
	 
    extracted();
   String str= new String("quick brown fox jumps over the lazy dog");
   System.out.println(str.substring(15));
   System.out.println(str.substring(15, 20));
   
   String str1 = new String("This is a BeginnersBook tutorial");   
   String str2 = new String("dsd");
   String str3 = new String("Book");
   String str4 = new String("Books");
   System.out.println("Index of B in str1: "+str1.indexOf('B'));
   System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));
   
   System.out.println("Index of string str2 in str1:"+str1.indexOf("is"));
   System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));
 }

private static void extracted() {
	String str="abbc";
	  System.out.println("All substring of abbc are:");
	   for (int i = 0; i < str.length(); i++) {
	   for (int j = i+1; j <= str.length(); j++) {	 
	         System.out.println(str.substring(i,j));
	 
	   }   
	  }
}
 
}
 