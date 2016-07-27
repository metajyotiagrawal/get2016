package OOPS5;

import java.util.List;
/*
 * profile here denotes the node
 * which user want to add,delete or get
 */
public class Graph extends OperationProfile 
{

public void addNode(){
	Profile p=new Profile();
	p.createFile();
}
public void deleteNode(){
	show();
	delete();
	showEditFile();
}
public void getNode(){
	show();
	}
}



