package DS1;

import java.util.Scanner;

public class SingleLinkedlist<E> {
	Node<E> start = new Node();
	Node<E> currentNode = null;
	void add(E data) {
		Node<E> newNode = new Node<E>();
		newNode.value = data;

		if (start.next == null) {
		start.next = newNode;
		} else {
		currentNode = start.next;
		while (currentNode.next != null) {
		currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		}

		}
	
	public void traverse(){
		currentNode=start;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
			System.out.println(currentNode.value);
			
		}
	}
	public void removeItem(E item){
		Node<E> prev=new Node();
		currentNode = start.next;
	prev=start;
			if(start.value==item){
		start.value=null;
		start.next=null;
			}
			else{
				while(currentNode.next!=null){
					currentNode=currentNode.next;
					prev=prev.next;
					if(currentNode.value==item){
						prev.next=currentNode.next;
						break;
					}
				}
			}
}
public void removeAtIndex(int index)	
{
	Node<E> prev=new Node();
	currentNode=start.next;
	prev=start;
	for(int i=0;i<index;i++){
		currentNode=currentNode.next;
		prev=prev.next;
		
	}
	prev.next=currentNode.next;
}
public void retrieve(int index){
	currentNode=start;
	for(int i=0;i<index;i++){
		currentNode=currentNode.next;
	}
	System.out.println(currentNode.value);
}
void reverseList() {

if (start.next == null) {
return;
} else {
currentNode = start.next;
Node<E> firstPointer = new Node<E>();
Node<E> secondPointer = new Node<E>();

while (currentNode != null) {
secondPointer = firstPointer;
firstPointer = currentNode;
currentNode = currentNode.next;
firstPointer.next = secondPointer;
}
start.next = firstPointer;

}
	 } 
public static void main(String args[]){
	SingleLinkedlist<String>  le= new SingleLinkedlist<String>();
	le.add("first");
	le.add("second");
	le.add("third");
	le.add("fourth");
	le.add("fifth");	
	le.traverse();
	le.removeItem("third");
	le.traverse();
	//le.removeAtIndex(2);
	//le.traverse();
	//le.retrieve(1);
	//le.traverse();
	System.out.println("reverse list is");
	le.reverseList();
	le.traverse();
}
}




