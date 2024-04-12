package com.questions.coding.arrays;

public class maximumSubarraySum {

	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        	sum+=arr[i];
        	if(sum>max)
        		max=sum;
        	if(sum<0)
        		sum=0;
        }
        	System.out.println("The maximum subarray sum is "+max);	

	}

}

//BRUTE'S FORCE APPROACH
//int[] arr= {-2,-3,4,-1,-2,1,5,-3};
//int sum=0;
//int max=Integer.MIN_VALUE;
//for(int i=0;i<arr.length;i++)
//{
//	sum=0;
// 	for(int j=i;j<arr.length;j++)
// 	{
// 		sum+=arr[j];
// 		max=Math.max(max, sum);
// 	}
// 	
//}
//System.out.println("The maximum sum subarray is : "+max);