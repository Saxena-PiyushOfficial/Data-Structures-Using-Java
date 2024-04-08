package Basic_DSA;

public class BinarySearch {
   public static int binarySearch(int[] nums,int x)
   {
	   int mid=0;
		int low=0;
		int high=nums.length-1;
		while(low<=high)
		{
			 mid=(low+high)/2;
			if(x<nums[mid])
				high=mid-1;
			else if(x>nums[mid])
				low=mid+1;
			else
				return mid;
		}
		return -1;
   }
   public static void main(String[] args) {
		int len=10;
		int[] arr=new int[len];
		int x=10;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println(binarySearch(arr, x));
		
	}
}
