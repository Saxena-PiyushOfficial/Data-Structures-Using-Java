package bubblesort;

import java.util.Scanner;

public class BubbleSort {
	public static int arr[];
	public void Bsort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length-(i+1);j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
			}
		}
	}

	public void insertElements(int arr[], Scanner sc) {
		
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
