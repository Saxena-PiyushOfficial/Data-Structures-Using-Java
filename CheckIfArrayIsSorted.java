package com.questions.coding.arrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
     int[] arr= {4,6,7,7,8,1,9,10};
  for(int i=0;i<arr.length-1;i++)
  {
	  if(arr[i]<=arr[i+1])
	  {
		  continue;
	  }
	  else {
		  System.out.println("False");
	       System.exit(0);
	  }
	
  } 
  System.out.println("True");

	}

}
