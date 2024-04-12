package com.questions.coding.arrays;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] nums= {3, 2, -1, 4, -6, 3, -2, 6};
		    int maxProd = nums[0];
	        int minProd = nums[0];
	        int maxProduct = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < 0) {
	                int temp = maxProd;
	                maxProd = minProd;
	                minProd = temp;
	            }

	            maxProd = Math.max(nums[i], maxProd * nums[i]);
	            minProd = Math.min(nums[i], minProd * nums[i]);

	            maxProduct = Math.max(maxProduct, maxProd);
	        }

	       System.out.println(maxProduct);
	}

}
