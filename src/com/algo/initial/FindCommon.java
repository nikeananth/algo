package com.algo.initial;

public class FindCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int ar1[] = {1, 5, 10, 20, 40, 80};
	        int ar2[] = {6, 7, 20, 80, 100};
	        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	 
		
		//extracted(ar1, ar2, ar3, i, j, k);
		
	
		   
		   int max=120;
		   
		   int[] feq=new int[max+1];
		    for (int i = 0; i < ar1.length; i++)
		    {
		    	feq[ar1[i]]++;
		    }
		    for (int i = 0; i < ar2.length; i++)
		    {
		    	feq[ar2[i]]++;
		    }
		    for (int i = 0; i < ar3.length; i++)
		    {
		    	feq[ar3[i]]++;
		    }
		    
		    for (int i = 0; i <= max; i++)
	            if (feq[i] == 3)
	                System.out.print(i + " ");
	}

	private static void extracted(int[] ar1, int[] ar2, int[] ar3, int i, int j, int k) {
		while(i<ar1.length && j<ar2.length && k< ar3.length) {
			   if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
	             {   System.out.print(ar1[i]+" ");   i++; j++; k++; }
	 
	             // x < y
	             else if (ar1[i] < ar2[j])
	                 i++;
	 
	             // y < z
	             else if (ar2[j] < ar3[k])
	                 j++;
	 
	             // We reach here when x > y and z < y, i.e., z is smallest
	             else
	                 k++;
				
			
			
		}
	}

}
