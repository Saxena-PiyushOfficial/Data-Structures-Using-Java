package com.questions.coding.arrays;

import java.util.HashMap;

public class largestSubarraySum {

	public static void main(String[] args) {
		int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};
	 int k=0;
	 HashMap<Integer,Integer> hm=new HashMap<>();
	 int maxLen=0;
	 int currSum=0;
	 for(int i=0;i<arr.length;i++) {
		 currSum+=arr[i];
		 if(currSum==k)
			 maxLen=i+1;
		 
		 if(hm.containsKey(currSum-k))
			 maxLen=Math.max(maxLen, i-hm.get(currSum-k));
		 
		 if(!hm.containsKey(currSum))
			 hm.put(currSum, i);
	 }
	 System.out.println(maxLen);

	}

}
