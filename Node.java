package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * class that takes two arraylist 
 * one for neighbour friends
 * another for blocked friends
 */
public class Node {
	List<String> neighbour = new ArrayList<String>();
	List<String> blocked = new ArrayList<String>();
	Profile op = new Profile();
	boolean profile;

	/*
	 * function to enter friends
	 * some initials only
	 */
	public void enterFriends() {
		neighbour.add("jyoti");
		neighbour.add("amita");
	}
	
	//method to add new Node
	public void addNode(){
		Profile p=new Profile();
		int i=0;	
		while(i>=0){
			Scanner sc=new Scanner(System.in);
			System.out.println("If you want to exit press 1");
			int exit=sc.nextInt();
			if(exit==1){
				break;
			}
			else{
			p.createFile();
	
			}
			i++;
			sc.close();	
	}
	}
	
	//method to delete existing Node
	public void deleteNode(){
		op.show();
		op.delete();
		op.showEditFile();
	}
	
	//method to access existing Node
	public void getNode(){
		op.show();
		}
	

	/*
	 * function to enter blocked
	 * some initials only
	 */
	public void enterBlocked() {
		blocked.add("amit");
		showList();
	}

	/*
	 * function to add friends if friends does not exist
	 */
	public void addNeighbour(String conn) {
		if (!neighbour.contains(conn)) {
			neighbour.add(conn);
		}
		showList();
	}

	/*
	 * function to remove friends if exists
	 */
	public boolean removeNeighbour(String remove) {

		if (neighbour.contains(remove)) {
			neighbour.remove(remove);
			return true;
		}
		return false;
	}

	public boolean removeProfile() {
		return true;
	}

	/*
	 * if friend exists then return zero
	 */
	public boolean isFriend(String query) {

		if (neighbour.contains(query)) {
			return true;
		}
		return false;
	}

	/*
	 * function to return arraylist neighbour
	 */
	public List<String> getNeighbours() {

		return neighbour;
	}

	/*
	 * function to block any node and add it into blocked list
	 */
	public boolean blockNode(String node) {

		if (!blocked.contains(node)) {
			blocked.add(node);
			return true;
		}
		return false;
	}

	/*
	 * to check whether node is blocked or not
	 */
	public boolean isBlockedNode(Node node) {

		if (blocked.contains(node)) {
			return true;
		}
		return false;
	}

	/*
	 * function to print neignbour and blocked list
	 */
	public void showList() {
		for (String string : neighbour) {
			System.out.println(string);
		}
		for (String string : blocked) {
			System.out.println(string);
		}
	}
}