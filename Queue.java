package Queue;
/**
 * class to implement queue using array
 * class can be implemented on any data type as Queue is generic class
 */
public class Queue<T>{
	
	public int maxlength=5;          //maximun length of qarray
	public Oject Qarray[] = new Object[maxlength];    
	public int rear;            //position to add item
	public int front;          //position to delete item
	
	public Queue()
	{
		rear=-1;
		front =-1;
	}
	// to add element in queue
	public void enQueue(Object item)
	{
		if(rear==-1&&front==-1)       //if array is empty
		{
			rear=0;
			front=0;
			Qarray[rear]=(T) item;
		}
		else if(front==(rear+1)||(rear==(maxlength-1)&&front==0))//if array is full
		{
			System.out.println("Queue overflow ");
		}
		else if(rear==maxlength)     //if rear is at maxlength then new element is being added at 0th position
		{
			rear=0;
			Qarray[rear]=(T) item;
		}
		else
		{
			rear++;
			Qarray[rear]=(T) item;
		}
		
	}
	
	
	//function to remove item from queue
	//returns element dequeued
	public Object deQueue()
	{
		if(front==-1&&rear==-1)  //if queue is empty
		{
			System.out.println("Queue underflow ");
			return null;
		}
		else if(front ==maxlength)    //if rear is at maxlength then new element is being added at 0th position
		{
			Object temp = Qarray[front];
			Qarray[front]=null;
			front =0;
			return temp;
		}
		else
		{
			Object temp = Qarray[front];
			Qarray[front]=null;
			front++;
			return temp;
		}
	}
	
	//clears Queue
	public void makeEmpty()
	{
		for(int i = 0;i<maxlength-1;i++)
		{
			deQueue();
		}
		System.out.println();
	}
	
	//to get element at front
	public Object getfront()
	{
		return Qarray[front];
	}
	 
	//to display Queue elements
	public void display()
	{
		for(int i=0;i<maxlength;i++)
		{
			System.out.println(Qarray[i]);
		}
		System.out.println();
	}
	
	
	
public static void main(String args[])
	{
		Queue obj = new Queue();
		obj.enQueue("a");
		obj.enQueue("b");
		obj.enQueue("c");
		obj.enQueue("d");
		obj.enQueue("e");
		obj.display();
		obj.enQueue("f");
		obj.deQueue();
		obj.display();
		System.out.println(obj.getfront());
	obj.makeEmpty();
	obj.display();
		
		
	}
}
