package com.algo.initial;

public class OnEditAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	extracted();
		String str1="aple";
		String str2="apple";
		
		int index1=0;
		int index2=0;
		
		while(index1<str1.length()&&index2<str2.length()) {
			
			if(str1.charAt(index1)==str2.charAt(index2)) {
				index1++;
				index2++;
				
			}else {
				System.out.println(index2);
				break;
			}
		}
		
		
	}

	private static void extracted() {
		String str1="apple";
		String str2="appee";
		

		if(str1.length()==str2.length()) {
			//replace
			
			for(int i=0;i<str1.length();i++) {
				
				if(str1.charAt(i)==str2.charAt(i)) {
					System.out.println(str1.charAt(i));
				}
				else {
                    System.out.println("replace"+str2.charAt(i));
				}
			}
		}
	}

}
