package Arrays;
import java.util.*;

public class SpiralOrder {
	
	public static void main(String arg []) {
		
		    
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the N value");
		
		int n = s.nextInt();
		
		
		
		
		
		
		
		int arr[][]=new int [n][n];
		
		int right = arr.length-1;
		int left =0;
		int top = 0;
		int bottom =arr.length-1;
		
		 int ar =1;
		while(top<bottom && left<right) {
			
			
			for(int i=left; i<=right; i++) {
				
				arr[top][i]=ar++;
				
			}
			 top++;
			 
			 for(int i =top; i<=bottom; i++) {
				 
				 
				 arr[i][right]=ar++;
				 
				 
			 }
			 right--;
			
			
			for(int i =right; i>=left; i--) {
				
				
				arr[bottom][i]=ar++;
			}
			bottom--;
			for(int i =bottom; i>=top; i--) {
				
				 arr[i][left]=ar++;
				
				
			}
			
			left++;
			
			 
			
		}
		  
		 if(n%2!=0) {
		 
		  arr[top][left]=ar;
		 }
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
