package oops;

import java.util.Scanner;

/**
 * this the main class that contain main function class to take options from
 * user either select Create new Profile, Delete your own profile, Access your
 * own profile then call function on basis of choice then select either remove
 * neignbour,add neighbour and blocked neignbour then call function on basis of
 * choice
 * 
 * @author jyoti
 *
 */
public class SocialNetwork {

	public SocialNetwork() {
	}

	/*
	 * function to take option from user
	 */
	public void option() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter profile which you need to add or block");
		String str = sc.next();
		Node nd = new Node();
		int choice = 0;
		PrintConstant pc = new PrintConstant();
		pc.constant();
		choice = sc.nextInt();
		switch (choice) {

		case 1:
			nd.addNode();
			break;
		case 2:
			if (nd.removeProfile()) {
				nd.deleteNode();
			}
			break;
		case 3:
			nd.getNode();
			break;
		case 4:
			nd.addNeighbour(str);
			break;
		case 5:
			nd.blockNode(str);
			break;
		case 6:
			nd.removeNeighbour(str);
			break;
		case 7:
			nd.isFriend(str);
			break;
		default:
			System.out.println("such operation does not exist");
			break;

		}
		sc.close();
	}

	public static void main(String args[]) {
		SocialNetwork sc = new SocialNetwork();
		sc.option();

	}
}