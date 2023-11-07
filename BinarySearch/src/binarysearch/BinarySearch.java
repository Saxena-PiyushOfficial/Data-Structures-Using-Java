package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
      
	public static int array[];
    public static int bSearch(int array[],int ele,Scanner sc)
    {
    	int low=0;
    	int high=array.length-1;
    	int mid;
    		while(low<=high)
    		{
    			mid=(high+low)/2;
    			if(array[mid]>ele)
    			{
    				high=mid-1;
    			}
    			else if(array[mid]==ele)
    			{
    				return mid;
    			}
    			else
    			{
    				low=mid+1;
    			}
    		}  
    	return -1;
    }
    public static void insertTheArray(int array[],Scanner sc)
    {
    	System.out.println("Enter the Elements");
    	for(int i=0;i<array.length;i++)
    	{
    		array[i]=sc.nextInt();
    	}
    	Arrays.sort(array);
    }
    public static void display(int array[])
    {
    	for(int x:array)
    	{
    		System.out.print(x+" ");
    	}
    }
}
