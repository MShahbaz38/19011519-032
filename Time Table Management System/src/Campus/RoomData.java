package Campus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomData {
	private String csvfile = "C:\\Users\\shahb\\workspace\\Time Table Management System\\src\\Rooms.csv";

	public String getCsvfile() {
		return csvfile;
	}

	public void setCsvfile(String csvfile) {
		this.csvfile = csvfile;
	}
	
	@SuppressWarnings("resource")
	public List<Room> findAll() {
		List<Room> rooms = new ArrayList<Room>();
		String line;
		try {
			BufferedReader findrooms = new BufferedReader(new FileReader(this.csvfile));
			
			while((line = findrooms.readLine()) != null) {
				Room room = new Room();
				
				String[] roomcolumn = line.split(",");
				
				room.setRoom_ID(Integer.parseInt(roomcolumn[0]));
				room.setRoom_name((roomcolumn[1]));
				room.setRoom_floor(Integer.parseInt(roomcolumn[2]));
				room.setRoom_capacity(Integer.parseInt(roomcolumn[3]));
				room.setRoom_type((roomcolumn[4]));
				
				rooms.add(room);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rooms;
	}
	@SuppressWarnings("resource")
	public Room findOne(int room_ID) {
		
		String line;
		try {
			BufferedReader findrooms = new BufferedReader(new FileReader(this.csvfile));
			
			while((line = findrooms.readLine()) != null) {
				Room room = new Room();
				
				String[] roomcolumn = line.split(",");
				
				if(Integer.parseInt(roomcolumn[0]) == room_ID) {
				
				room.setRoom_ID(Integer.parseInt(roomcolumn[0]));
				room.setRoom_name((roomcolumn[1]));
				room.setRoom_floor(Integer.parseInt(roomcolumn[2]));
				room.setRoom_capacity(Integer.parseInt(roomcolumn[3]));
				room.setRoom_type((roomcolumn[4]));
				
				return room;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
