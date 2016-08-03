package DS4;
/*
 * class to define hash table
 * here roomNum->Key
 * guest->Key Value
 *
 */
public class GuestHouseEntry
{
public Guest guest;
public int roomNum;

public GuestHouseEntry(int age,int num) {
	this.guest = null;
	this.roomNum=num;

}

public GuestHouseEntry(int num) {
	this.guest = null;
	this.roomNum=num;

}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}

public int getRoomNum() {
	return roomNum;
}


}
