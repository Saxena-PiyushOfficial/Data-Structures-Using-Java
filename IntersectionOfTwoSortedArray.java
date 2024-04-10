package com.questions.coding.arrays;

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,1,2,3,4,5};
		int[] arr2= {2,3,4,4,5,6};
	   int[] insec=new int[Math.min(arr1.length, arr2.length)];
	   int i=0;int j=0;int k=0;
	   while(i<arr1.length && j<arr2.length)
	   {
		   if(arr1[i]<arr2[j])
			   i++;
		   else if(arr1[i]>arr2[j])
			   j++;
		   else {
			   insec[k++]=arr1[i];
			   i++;
			   j++;
		   }
		   
			   
	   }
	   for(int m=0;m<k;m++)
		   System.out.print(insec[m]+" ");
	}

}
