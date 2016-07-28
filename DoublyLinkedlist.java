package DS1;

public class DoublyLinkedlist<E> {
DoubleNode<E> start=new DoubleNode<E>();
DoubleNode<E> current=null;
DoubleNode<E> last=new DoubleNode<E>();
void add(E data) {
	DoubleNode<E> newNode = new DoubleNode<E>();
	newNode.value = data;

	if (start.next == null) {
	start.next = newNode;
	} else {
	current = start.next;
	while (current.next != null) {
	current = current.next;
	}
	newNode.prev=current.next;
			
	current.next = newNode;
	last=newNode;
	}

	}
public void traverse(){
	current=start;
	while(current.next!=null){
		current=current.next;
		System.out.println(current.value);
		
	}
}
public void removeItem(E item){
	DoubleNode<E> previous=new DoubleNode();
	current = start.next;
	previous=start;
		if(start.value==item){
	start.value=null;
		}
		else{
			while(current.next!=null){
				if(current.value==item){
					previous.next=current.next;
					break;
				}
				previous = current;
				current = current.next;
			}
		}
}

public void removeAtIndex(int index)	
{
	DoubleNode<E> previous=new DoubleNode();
	current=start.next;
	previous=start;
	for(int i=0;i<index;i++){
		current=current.next;
		previous=previous.next;
		
	}
	previous.next=current.next;
}

public void retrieve(int index){
	current=start;
	for(int i=0;i<index;i++){
		current=current.next;
	}
	System.out.println(current.value);
}
public void reverse()
{
current = last;	
while(current.prev!=null){
	current=current.prev;
		System.out.println(current.value);
		
	}
}





public static void main(String args[]){
	DoublyLinkedlist<String>  le= new DoublyLinkedlist<String>();
	le.add("first");
	le.add("second");
	le.add("third");
	le.add("fourth");
	le.add("fifth");
	le.traverse();
	System.out.println("list after remove of element");
	le.removeItem("second");
	le.traverse();
	System.out.println("list after remove from index");
	le.removeAtIndex(1);
	le.traverse();
	System.out.println("retrieving data");
	le.retrieve(1);
	le.traverse();
	System.out.println("reverse list is");
	le.reverse();
}
}
