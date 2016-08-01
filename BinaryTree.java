package DS3;

import java.util.Scanner;

public class BinaryTree {
Node[] BArray=new Node[20];
public static int arr[]=new int[5];
public void addElement(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter element");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		System.out.println(arr[i]);
	
}}
public void createBTree(Node root){
	int index=0;
	for(int i=0;i<arr.length;i++){
		if(root==null){
			BArray[index].setValue(arr[i]);
			index++;
		}
		else{
			findPosition(root,0);
		}
	}
}
public void findPosition(Node root,int index){
	while(index<BArray.length){
		if(BArray[index].value>root.value){
		findPosition(root.getLeftPart(), index++);
	}
	else{
		findPosition(root.getRightPart(),index++);
	}
	}
}
public static void main(String args[]){
	BinaryTree bt=new BinaryTree();
	
	bt.addElement();
	Node root=null;
	//int a=arr[0];
	//root.setValue(a);
	bt.createBTree(root);
	bt.findPosition(root, 0);
}
}
