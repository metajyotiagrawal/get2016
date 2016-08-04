package DS5;

import java.util.LinkedList;
/*
 * class to implement the Queue functionality using the java collections
 * java collection used is LinkedList
 */
public class QueueUsingList {
public static LinkedList<Object> lnklst=new LinkedList<Object>();  

//function to implement enqueue operation of queue
public void enqueue(int num)
{
	lnklst.add(num);
}

//function to implement dequeue operation of queue
public void dequeue(int num)
{    if(lnklst.size()==0){
	lnklst.remove(num);
}
else
{
	System.out.println("Queue is empty");
}
}

//function to display list
public void display(){
	for(int i=0;i<lnklst.size();i++){
		System.out.println("Queue is:"+lnklst.get(i));
}
	}

public static void main(String args[])
{
	QueueUsingList obj=new QueueUsingList();
	obj.enqueue(3);
	obj.enqueue(5);
	obj.enqueue(8);
	obj.enqueue(1);
	obj.display();
	obj.dequeue(1);
	System.out.println("Queue after removing elment from it");
obj.display();

}


}
