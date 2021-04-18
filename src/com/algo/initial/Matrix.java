package com.algo.initial;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int array[]= {1,2,3,4,5,6}; for(int ar:array) { System.out.println(ar); }
		 */
   
   int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
   

   
   
   for(int i=0;i<matrix.length;i++) {
	   
	   for(int j=0;j<(matrix.length/2);j++) {
		   
		   int temp=matrix[i][j];
		   matrix[i][j]=matrix[i][matrix.length-1-j];
		   matrix[i][matrix.length-1-j]=temp;
	   }
   }
   
   extracted(matrix);
   
   
       for(int i=0;i<matrix.length;i++) {
    	   
    	   for(int j=i+1;j<matrix[i].length;j++)
    	   {
    		  // System.out.println(matrix[i][j]);
    		   
    		   int temp=matrix[i][j];
    		   matrix[i][j]=matrix[j][i];
    		   matrix[j][i]=temp;
    		   
    		   
    	   }
    	   System.out.println(Arrays.deepToString(matrix));
       }

       extracted(matrix);
       
        // extractedmain(matrix);
  // extracted1(matrix);
   
  // extracted3(matrix);
   
   
   
   
	}

	private static void extractedmain(int[][] matrix) {
		int left=0;
     
         
         int right=matrix.length-1;
      
         
         int topLeft=0;
         while(left<right) {
        	 
        	 
        	 for(int i=0;i<matrix.length-1;i++) {
        		 
        		    int top=left;
        		    int bottom=right;
        	         
        		  topLeft=matrix[top][left+i];
        		  
        		  matrix[top][left+i]=matrix[bottom-i][left];
        		  
        		  matrix[bottom-i][left]=matrix[bottom][right-i];
        		  
        		  
        		  matrix[bottom][right-i]=matrix[top+i][right];
        		  
        		  matrix[top+i][right]=topLeft;
        		
        		 
        	 }
        	 
       	  right=right-1;
		  left=left+1;
        	 
         }
         extracted(matrix);
	}

	private static void extracted3(int[][] matrix) {
		for(int row[]:matrix) {
			   System.out.println(Arrays.toString(row));
		   }
		   
		   Arrays.deepToString(matrix);
	}

	private static void extracted1(int[][] matrix) {
		for(int max[]:matrix) {
			   
			   for(int m:max) {
				   System.out.print(m);
			   }
			   System.out.println();
		   }
	}

	private static void extracted(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			   
			   for(int j=0;j<matrix[i].length;j++) {
				   
				   System.out.print(matrix[i][j]);
			   }
			   System.out.println("");
		   }
	}

}
