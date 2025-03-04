package Arrays;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int arr1[] [] = {{4,5,},
						{3,6,}
		                  };
		
		int arr2[][]= {{2,4},
				       {5,6}
		                   };
		
		
		int rearrange [][] = new int [arr2.length][arr2[0].length];
		
		  for(int i =0; i<arr2.length; i++) {
	         
			  for(int j =0; j<arr2[i].length; j++) {
				  
				  
				  rearrange[j][i]=arr2[i][j];
				  
				    
			  }
			  
			  
		  }
		  
		  
		  
		  int result [][] = new int [arr1.length][arr1[0].length];
		
		
		
         
	    
		
	  for(int i =0; i<arr1.length; i++) {
		  
		  
		  
		  for(int j =0; j<arr1[i].length; j++) {
			 
			int first [] = arr1[i];
			
			int secound []= rearrange[j];
			
			int sum =0;
			 for(int k = 0; k<arr1[0].length; k++) {
				 
			
				 sum+=first[k]*secound[k];
				 
				 
				 
			 }
			 
			 result[i][j]=sum;			 
			 
			
			  
		  }
	  }
		
		
		System.out.println(Arrays.deepToString(result));
	

	}

}
