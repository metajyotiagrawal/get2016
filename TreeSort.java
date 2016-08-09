package DS8;

import java.util.Scanner;
/**
 * to sort array using tree sort
 * by traversing tree inorder
 *
 */
public class TreeSort {

	public BTNode Root; // root node of binary tree

	// constructor
	public TreeSort() {
		Root = null;
	}

	/*
	 * method to create BST sets element item in BST
	 */
	public void createBT(BTNode root, int item) {

		BTNode temp = new BTNode(item);       //temporary TreeNode
		if (root.leftPart == null && root.value > item) {  //to check if left part is empty and root value is smaller than item then
			root.leftPart = temp;                           //leftPart become temporary
			System.out.println(root.leftPart.value);
		}else if(root.rightPart == null && root.value <= item){//check if rightPart is empty
			root.rightPart = temp;
			System.out.println(root.rightPart.value);
		} 
		
		else if ( root.value > item) {           //if root value is small than item return its leftNode
			createBT(root.leftPart, item);
		} else {                                   //if root value is greater than item then return rightNode
			createBT(root.rightPart, item);
		}
	}

	/*
	 * method for in-order traversal
	 */
	public void Inorder(BTNode root) {

		if (root != null) {
			Inorder(root.leftPart);
			System.out.println(root.value);
			Inorder(root.rightPart);
		}

	}

	public static void main(String args[])

	{
		Scanner input = new Scanner(System.in);
		TreeSort Btree = new TreeSort();
		System.out.println("how many elements in tree ");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		BTNode temp = new BTNode(array[0]);
		Btree.Root = temp;
		for (int i = 1; i < array.length; i++) {
			Btree.createBT(Btree.Root, array[i]);

		}
		System.out.println("ascending order :");
		Btree.Inorder(Btree.Root);
		input.close();
	}
	
}
