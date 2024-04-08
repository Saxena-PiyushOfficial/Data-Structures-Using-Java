package Basic_DSA;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {8,6,3,10,9,4,12,5,2,7};
		int k,temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=k=i;j<arr.length;j++)
			{
				if(arr[j]<arr[k])
				{
					k=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}
}
