package com.algo.initial;

public class powerComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(2,4));
	int a=2;int b=4;
int data=0;
while(b>0) {
	data=data+ a*a;
	//2*2*2*2
	b--;
}
System.out.println(data);
	}
	
	
	
	static int power(int a,int b) {
		
		if(b==0)
		{
			return 1;
		}
		int pow=power(a,b-1);
		 return a*pow;
	}

}
