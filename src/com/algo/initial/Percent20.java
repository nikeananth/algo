package com.algo.initial;

public class Percent20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int spaceCount = 0;
		
		String str1="Mr John Smith";
		char ch[]=str1.toCharArray();
		for(int i=0;i<str1.toCharArray().length;i++) {
			if(ch[i]==' ') {
				spaceCount++;				
			}
		}
		 int index_Len=str1.length()+spaceCount*2;
		 
		 char chNew[]=new char[index_Len];
		 
		 for(int i=str1.length()-1;i>=0;i--) {
			 
			 
			 
		 if(ch[i]==' ') {
			chNew[index_Len-1]='m';
			chNew[index_Len-2]='2';
			chNew[index_Len-3]='%';		
			index_Len=index_Len-3;
		}
		 else{
			chNew[index_Len-1]=ch[i];
			index_Len--;
			
		}
		
		 
		 

			 
		 }
		 
		 System.out.println(String.valueOf(chNew));
	}

}
