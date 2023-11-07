package tester;

import java.util.Scanner;

import binaryTree.BinaryTree;

public class TreeTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            
			BinaryTree bt = new BinaryTree();

			do {
				System.out.println("\n-----------Binary Tree Menu Driven Program---------");
				System.out.println("1.AddNode");
				System.out.println("2.Display Inorder Traversal");
				System.out.println("3.Display Preorder Traversal");
				System.out.println("4.Display Postorder Traversal");
				System.out.println("0.Exit");
				System.out.println("Choose option");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter the element to insert");
					bt.insert(sc.nextInt());
					break;
				case 2:
					System.out.println(" Inorder Traversal");
					bt.inorderTraversal();
					break;
				case 3:System.out.println(" Preorder Traversal");
				        bt.preorderTraversal();
					break;
				case 4:System.out.println("Postorder Traversal");
		          bt.postorderTraversal();
		    break;
				case 0:
					System.out.println("Exiting......");
					System.exit(0);
				}
			} while (true);
		}


	}

}
