package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	
	public static void main(String arg []) {
	  int arr [] = {1,2,3,4,5,6};
	
	  
	  Scanner s = new Scanner (System.in);
	  
	  System.out.println("Enter the Rotate Count");
	  
	  int rotate = s.nextInt();
	  
	  int temp =0;
	
	   
	  while(rotate>0) {
	  for(int i =0; i<arr.length-1; i++) {
		   
		 
	   temp = arr[i];
	   
	   arr[i] = arr[i+1];
	   
	   
	    arr[i+1]=temp;	   
	   
	     
	
	}
	  
	  rotate--;
	}
	  System.out.println(Arrays.toString(arr)); 
	}
	
}
