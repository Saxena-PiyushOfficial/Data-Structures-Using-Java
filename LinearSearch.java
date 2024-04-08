package Basic_DSA;

public class LinearSearch {

	public static void main(String[] args) {
	int[] arr= {5,9,8,6,4,3,19,10,20};
	int x=19,flag=0;
	int index=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==x)
		{
			flag=1;
			index=i;
			break;
		}
		
		
	}
	if(flag==1)
		System.out.println("Found at "+index);
	else
	  System.out.println("No");

}
}
