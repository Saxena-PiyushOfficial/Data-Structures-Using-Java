package selectionsort;

import java.util.Scanner;

public class SelectionSort {
	public static int arr[];

	public void Ssort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
                  if(arr[index]<arr[j])
                	  index=j;
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public void insertElements(int arr[], Scanner sc) {
		System.out.println("Enter the Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public void display(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
