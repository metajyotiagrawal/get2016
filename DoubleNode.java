package DS1;

public class DoubleNode<E> {
E value;
DoubleNode<E> prev;
DoubleNode<E> next;
public DoubleNode(){
	prev=null;
	next=null;
}
public DoubleNode(E item){
	prev=null;
	next=null;
	value=item;
}
}