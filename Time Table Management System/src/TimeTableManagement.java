import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Campus.Room;
import Campus.RoomData;
public class TimeTableManagement {
	

	public static void main(String[] args) throws IOException{
		RoomData roomdata = new RoomData();
//		Room room = roomdata.findOne();
//		System.out.println(room.toString());
		
		List<Room> room = roomdata.findAll();
		for(int i = 0; i < room.size(); i++) {
			System.out.println(room.get(i));
		}
		
		/*room.setRoom_ID(1);
		room.setRoom_name("CR-01");
		room.setRoom_type("Class Room");
		room.setRoom_floor(1);
		room.setRoom_capacity(50);
		
		System.out.println(room.toString());
*/		
		

		}
		
	}