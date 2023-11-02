package ArrayOperations;

import java.util.Scanner;

public class ArrayTester {
	static void Display(int arr[]) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	static void Reverse(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	static void replace(int arr[], int ele, int index) {
		for (int j = 0; j < arr.length; j++) {
			if (j == index) {
				arr[j] = ele;
			}
		}
	}

	static int additionOfElements(int arr[]) {
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum += arr[k];
		}

		return sum;
	}

	static void averageOfElements(int arr[], int n) {
		int avg;
		int sum = additionOfElements(arr);
		avg = sum / n;
		System.out.println("The average of elements of array is " + avg);
	}

	static int maximumElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static void displayEvenOdd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println("The " + arr[i] + " is Even");
			else
				System.out.println("The " + arr[i] + " is Odd");
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the count of array elements");
			int[] A = new int[sc.nextInt()];
			System.out.println("Enter the array elements:");
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();

			}

			do {

				System.out.println("\n----------Array Operations Menu-------------");
				System.out.println("1.Display-------------");
				System.out.println("2.Reverse-------------");
				System.out.println("3.Replace at Nth position-------------");
				System.out.println("4.Addition of array-------------");
				System.out.println("5.Maximum Number from Array-------------");
				System.out.println("6.Average of Elements from Array-------------");
				System.out.println("0.Exit------------------");
				System.out.println("Enter your choice:");
				switch (sc.nextInt()) {
				case 1:
					Display(A);
					break;
				case 2:
					Reverse(A);
					break;
				case 3:
					System.out.println("Enter the element for replace and index number");
					replace(A, sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.println("The sum of elements of array is " + additionOfElements(A));
					break;
				case 5:
					System.out.println("The max of elements of array is " + maximumElement(A));
					break;
				case 6:
					averageOfElements(A, A.length);
					break;
				case 0:
					System.out.println("Exiting.........");
					System.exit(0);
				}
			} while (true);
		}

	}

}
