package oops;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintConstant {
	public void constant(){
		
	ArrayList<String> showOption = new ArrayList<String>();
	System.out.println("Enter your choice");
	showOption.add("1. Create new Profile");
	showOption.add("2. Delete your own profile");
	showOption.add("3. Access your own profile");
	showOption.add("4. addNeignbour");
	showOption.add("5. blockNode");
	showOption.add("6. remove neighbour");
	showOption.add("7. addFriend");
	
	ListIterator<String> i = showOption.listIterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
