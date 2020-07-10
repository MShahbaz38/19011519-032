package Time_Table;

import Campus.Room;
import teacher.Teacher;

public class TimeTable {
	private int	TIMETABLE_ID;
	private Teacher	TEACHERCOURSE_ID;
	private TimeSlot TIMESLOT_ID;
	private Room ROOM_ID;
	
	
	public int getTIMETABLE_ID() {
		return TIMETABLE_ID;
	}
	public void setTIMETABLE_ID(int tIMETABLE_ID) {
		TIMETABLE_ID = tIMETABLE_ID;
	}
	public Teacher getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}
	public void setTEACHERCOURSE_ID(Teacher tEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = tEACHERCOURSE_ID;
	}
	public TimeSlot getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}
	public void setTIMESLOT_ID(TimeSlot tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}
	public Room getROOM_ID() {
		return ROOM_ID;
	}
	public void setROOM_ID(Room rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}

	public String toString() {
		String str = null;
		
		str = this.TIMETABLE_ID + "," + this.TIMESLOT_ID + "," + this.ROOM_ID + "," + this.TEACHERCOURSE_ID;
		return str;
	}

}
