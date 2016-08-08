package DS4;

import java.util.Scanner;

/**
 * class to allot rooms in guest house on the basis of age and 
 * display room number with the name of guest
 */
public class GuestHouse {

	int totalGuests = 0;
	int totalRooms = 0;
	GuestHouseEntry[] ghMap;
	
//to enter total rooms by user
	public void getTotalRooms() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of rooms in guestHouse");
		totalRooms = sc.nextInt();
		ghMap = new GuestHouseEntry[totalRooms];
	}
	
//to enter total number of guest by user
	public void getTotalGuests() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter total number of guests, should be less than total rooms");
		totalGuests = sc.nextInt();
	}
	
//to set room number to each room
	public void setRoomnumber() {
         for (int i = 0; i < totalRooms; i++) {
          ghMap[i] = new GuestHouseEntry(i + 100);     
		}
	}
	
//to find hash key
	public int getKey(int age) {
		int hash = age % totalRooms;
		while (ghMap[hash].guest != null) {//condition to check that value of guest of array ghMap at hash index 
			hash = (hash + 1) % totalRooms;//should be empty

		}
		return hash;
}

	
	//to allocate rooms to guest
	public void allocateRoom(Guest guest) {
		int key = getKey(guest.age);
		for (int i = 0; i < totalRooms; i++) {
			if (key == ghMap[i].roomNum % 100) {//to check key is equal to room number modulus 10 to allocate room 
				ghMap[i].guest = guest;

				break;
			}

		}

	}
//to display room number and the name of alloted guest
	public void DisplayResult() {

		for (int i = 0; i < totalRooms; i++) {
			if (ghMap[i].guest == null) {
				ghMap[i].guest = new Guest(0, "not alloted");
			}
		}
		System.out.println("Room No\t\tGuest_Name");
		for (int cnt = 0; cnt < totalRooms; cnt++) {
			System.out.println(ghMap[cnt].roomNum + "\t\t"
					+ ghMap[cnt].guest.name);
		}
	}
//to enter name by user
	public String getname() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String str = sc.next();
		return str;
		
	}
	
//to enter age by user
	public int getage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int ag = sc.nextInt();
		return ag;
	}

	public static void main(String rgs[]) {
		Scanner sc = new Scanner(System.in);
		GuestHouse ob = new GuestHouse();
		ob.getTotalRooms();
		ob.setRoomnumber();
		ob.getTotalGuests();
		for (int cnt = 0; cnt < ob.totalGuests; cnt++) {

			String name = ob.getname();

			int age = ob.getage();
			Guest g = new Guest(age, name);
			ob.allocateRoom(g);
		}
		ob.DisplayResult();
		sc.close();

	}

}
