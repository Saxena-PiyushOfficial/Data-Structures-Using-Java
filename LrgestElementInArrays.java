package com.questions.coding.arrays;

public class LrgestElementInArrays {

	public static void main(String[] args) {
		int[] arr= {6,9,1,16,3,1,11};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println(max);
		
 
	}

}
