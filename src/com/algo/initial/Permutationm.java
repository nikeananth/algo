package com.algo.initial;

public class Permutationm {
	public static void main(String[] args) {
		permutation("ABC");
	}
	

public static void permutation(String str) {
    permutation(str, "");
}

public static void permutation(String str, String prefix) {
	
    System.out.println("str"+ str +"prefix"+prefix);
    
    
    if (str.length() == 0) {
        System.out.println(prefix);
    } else {
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1);
            System.out.println("rem"+ str.substring(0, i)+"sss"+str.substring(i + 1));
            permutation(rem, prefix + str.charAt(i));
        }
    }
}
}

