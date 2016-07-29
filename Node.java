package DS1;
//class used to define node of single linklist
public class Node<E> {
	public E value;
	Node<E> next;
public Node(){
	value=null;
	next=null;
}
public Node(E item1){
	value=item1;
	next=null;
}
}
