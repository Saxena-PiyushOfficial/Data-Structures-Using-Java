package insertionsort;

import java.util.Scanner;

public class InsertionSort {
	public static int arr[];

	public void Isort(int arr[]) {
		int temp, key;
		for (int i = 0; i < arr.length - 1; i++) {
			key = arr[i + 1];
			for (int j = i + 1; j > 0; j--) {

				if (key < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}

			}
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
