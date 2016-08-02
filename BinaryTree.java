package DS3;
import java.util.Scanner;
/**
 * class to create binaryTree
 * to print values in postorder and preorder
 * @author jyoti
 *
 */
public class BinaryTree {
	public static int arr[] = new int[9];
	
	public TreeNode root;
//unparameterized constructor
	public BinaryTree() {
		root= new TreeNode(10);                 //to fix root value
		
	}
//function to store values in array
	public void getArray() {
		System.out.println("Enter Array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
//function to create Tree
	public void createBT(TreeNode root, int item) {
		TreeNode temp = new TreeNode(item);       //temporary TreeNode
	
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
//function to print tree in preorder
	public void preOrder(TreeNode root) {
		
		if (root != null) {
			// Visit the node by Printing the node data
			System.out.println("preorder value is" + root.value);
			preOrder(root.leftPart);

			preOrder(root.rightPart);
		}
	}
//function to print tree in postorder
	public void postOrder(TreeNode root) {
		

		if (root != null) {
			postOrder(root.leftPart);
			postOrder(root.rightPart);
			// Visit the node by Printing the node data
			System.out.println("postorder value is" + root.value);
		}
	}

	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.getArray();
		for (int i = 0; i < 9; i++) {
			bt.createBT(bt.root, arr[i]);
		}
		 bt.preOrder(bt.root);
		
		 bt.postOrder(bt.root);
		
	}
}
