package binaryTree;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public void insert(int val)
	{
		Node newNode=new Node(val);
		if(root==null)
		{
			root=newNode;
		}
		else
			insert(root,newNode);
	}
	private void insert(Node node,Node newNode)
	{
		if(newNode.data<node.data)
		{
			if(node.left==null)
			{
				node.left=newNode;
			}
			else
			{
				insert(node.left,newNode);
			}	
		}
		else
		{
			if(node.right==null)
			{
				node.right=newNode;
			}
			else
			{
				insert(node.right,newNode);
			}	
		}
		
	}
	public void preorderTraversal()
	{
		preorderTraversal(root);
	}
	private void preorderTraversal(Node node)
	{
		if(node==null)
			return;
		else
		{
			System.out.print(node.data+" ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
	public void inorderTraversal()
	{
		inorderTraversal(root);
	}
	private void inorderTraversal(Node node)
	{
		if(node==null)
			return;
		else
		{
			inorderTraversal(node.left);
			System.out.print(node.data+" ");
			inorderTraversal(node.right);
		}
	}
	public void postorderTraversal()
	{
		postorderTraversal(root);
	}
	private void postorderTraversal(Node node)
	{
		if(node==null)
			return;
		else
		{
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	/*
	 * public void print() { print(root); } private void print(Node node) { if(node
	 * ==null) { return; } print(node.left); System.out.print(node.data+" ");
	 * print(node.right);
	 * 
	 * }
	 */
}
