package Arrays;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		
		int arr [] [] = {{1,2,3},
				         {4,5,6},
				         {7,8,9}
				         };
		
		int row = arr.length;
		int col = arr[0].length;
		
		int resultarr [] [] = new int [col][row];
		
		 
	  for(int i =0; i<row; i++) {
         
		  for(int j =0; j<col; j++) {
			  
			  
			  resultarr[j][i]=arr[i][j];
			  
			    
		  }
		  
		  
	  }
		
		
		
				
		
		System.out.println(Arrays.deepToString(resultarr));
		
		
		
	}

}
