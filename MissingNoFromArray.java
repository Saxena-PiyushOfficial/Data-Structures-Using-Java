package com.questions.coding.arrays;



public class MissingNoFromArray {

	public static void main(String[] args) {
	int[] arr= {3,0,1};
	
	int n=arr.length;
	
	int esum=n*(n+1)/2;
	int osum=0;
	for(int i=0;i<arr.length;i++)
	{
	  osum+=arr[i];
	}
	
System.out.println(esum-osum);
	}

}
