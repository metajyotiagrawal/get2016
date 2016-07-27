package OOPS5;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * this the main class that contain main function
 * class to take options from user either select Create new Profile, Delete your
 * own profile, Access your own profile then call function on basis of choice
 * then select either remove neignbour,add neighbour and blocked neignbour then
 * call function on basis of choice
 * 
 * @author admin
 *
 */
public class SocialNetwork extends Graph {

	public SocialNetwork() {
	}

	/*
	 * function to take options from user
	 */
	public void option() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Want to use for");
		ArrayList<String> showOption = new ArrayList<String>();
		showOption.add("1. Create new Profile");
		showOption.add("2. Delete your own profile");
		showOption.add("3. Access your own profile");
		ListIterator<String> i = showOption.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("Enter the number according to your choice ");
		choice = sc.nextInt();
		switch (choice) {

		case 1:
			addNode();
			break;
		case 2:
			deleteNode();
			break;
		case 3:
			getNode();
			break;
		default:
			System.out.println("No such option exist");
			break;
		}

	}

	/*
	 * function to add neighbour,check neighbour,remove neighbourand to block,
	 * check blocked
	 */
	public void operation() {
		int ch;
		String ne;
		Node nd = new Node();
		Scanner st = new Scanner(System.in);
		System.out.println("Enter your choice");
		ch = st.nextInt();
		System.out.println("Enter your string you want to add friend or block");
		ne = st.next();
		switch (ch) {
		case 1:
			nd.addNeighbour(ne);
			break;
		case 2:
			nd.removeProfile();
			break;
		case 3:
			nd.blockNode(ne);
			break;
		case 4:
			nd.removeNeighbour(ne);
			break;
		case 5:
			nd.isFriend(ne);
			break;
		default:
			System.out.println("such operation does not exist");
			break;

		}
	}

	public static void main(String args[]) {
		SocialNetwork sc = new SocialNetwork();
		sc.option();
		sc.operation();

	}
}
