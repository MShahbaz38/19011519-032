package Time_Table;

public class TimeSlot extends WeekDay {
	private int	TIMESLOT_ID;
	private	float TIMESLOT_START;
	private float TIMESLOT_END;
	
	public int getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}
	public void setTIMESLOT_ID(int tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}
	public float getTIMESLOT_START() {
		return TIMESLOT_START;
	}
	public void setTIMESLOT_START(float tIMESLOT_START) {
		TIMESLOT_START = tIMESLOT_START;
	}
	public float getTIMESLOT_END() {
		return TIMESLOT_END;
	}
	public void setTIMESLOT_END(float tIMESLOT_END) {
		TIMESLOT_END = tIMESLOT_END;
	}
	
	public String toString() {
		String str = null;
		
		str = this.TIMESLOT_ID + "," + this.getWeekday_ID() + this.TIMESLOT_START + "," + this.TIMESLOT_END;
		return str;
	}

}
