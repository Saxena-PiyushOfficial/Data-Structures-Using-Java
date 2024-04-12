package com.questions.coding.arrays;


public class RemoveDuplicate {
public static int removeDuplicate(int[] nums)
{
    int i=0;
    for(int j=1;j<nums.length;j++)
    {
    	if(nums[i]!=nums[j])
    	{
    		i++;
    		nums[i]=nums[j];
    	
    	}
    }
   return (i+1);
}
	public static void main(String[] args) {
	    int[] arr= {4,6,7,7,8,1,4,1,9,10};
    int len=removeDuplicate(arr);
    for(int i=0;i<len;i++)
    	System.out.print(arr[i]+" ");

}
}
//	  Set<Integer> hs=new LinkedHashSet<>();
//      for(int i=0;i<arr.length;i++)
//      {
//    	  hs.add(arr[i]);
//      }
//      for(int i:hs)
//    	  System.out.print(i+" ");
//	}