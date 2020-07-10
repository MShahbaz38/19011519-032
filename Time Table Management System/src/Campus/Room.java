package Campus;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Room {
	private int	room_ID;
	private String room_name;
	private int room_floor;
	private int room_capacity;
	private String room_type;
	
	
	
	public int getRoom_ID() {
		return room_ID;
	}
	public void setRoom_ID(int room_ID) {
		this.room_ID = room_ID;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public int getRoom_floor() {
		return room_floor;
	}
	public void setRoom_floor(int room_floor) {
		this.room_floor = room_floor;
	}
	public int getRoom_capacity() {
		return room_capacity;
	}
	public void setRoom_capacity(int room_capacity) {
		this.room_capacity = room_capacity;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	/*string name;
	String[] sa = new String[];
	for(int cr =0; cr <15; c++) {
	name + (String)cr;
		Room (name = new Room();
	}
	public void newRooms(int Room_ID, int room_capacity, String room_name, int room_floor, int room_type) {
	room1.setRoom_ID();
	}

	*/
	public String toString() {
		String str = null;
		
		str = this.room_ID + "," + this.room_name + "," + this.room_floor + "," + this.room_capacity + ","
				+ this.room_type;
		return str;
	}
/*	
	for(int i = 0; i < 15; i++) {
	Room room(i) = new Room()
	}
	
	List<> myrooms = new ArrayList<>();
	
	public void settingId() {
		for(int i = 0; i <15; i++) {
			myrooms.add(setRoom_ID("CR-"+i));
		}
	
	}
*/	

}