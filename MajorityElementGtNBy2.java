package com.questions.coding.arrays;

public class MajorityElementGtNBy2 {

	public static void main(String[] args) {
      int[] arr= {6,5,5};
      int N=arr.length;
      int count=1;
      int max=0;
      int ele=-1;
      for(int i=0;i<arr.length;i++)
      {
    	  count=0;
	   for(int j=i;j<arr.length;j++)
		{
		 if(arr[i]==arr[j])
			 count++;
	    }
   	
   	 if(count>max) {
   		 max=count;
   		 ele=arr[i];
   	 }
   	
      }
      if(max>N/2)
    	  System.out.println(ele);
      else
    	 System.out.println("-1");
   }
}
