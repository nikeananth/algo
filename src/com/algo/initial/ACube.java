package com.algo.initial;

public class ACube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//extracted();
		
		
	}

	private static void extracted() {
		for(int a=1;a<=1000;a++) {
			for(int b=1;b<=1000;b++) {
				for(int c=1;c<=1000;c++) {
					for(int d=1;d<=1000;d++) {
				    double aside=Math.pow(a, 3)+ Math.pow(b, 3);
					double bside=Math.pow( c, 3)+Math.pow(d, 3);
					System.out.println(aside==bside);			
					System.out.println(""+ aside);			
					}
				}
			}
		}
	}

}
