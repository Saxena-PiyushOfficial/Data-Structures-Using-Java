package Basic_DSA;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {6,8,4,9,2,1,5};
		int x,j;
		for(int i=1;i<arr.length;i++)
		{
			j=i-1;
			x=arr[i];
			while(j>-1 && arr[j]>x)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
		 for(int i:arr)
	        {
	        	System.out.print(i+" ");
	        }

	}

}
