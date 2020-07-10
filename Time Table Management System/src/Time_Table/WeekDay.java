package Time_Table;

public class WeekDay {
	private int weekday_ID;
	private String weekday_name;
	
	
	public int getWeekday_ID() {
		return weekday_ID;
	}
	public void setWeekday_ID(int weekday_ID) {
		this.weekday_ID = weekday_ID;
	}
	public String getWeekday_name() {
		return weekday_name;
	}
	public void setWeekday_name(String weekday_name) {
		this.weekday_name = weekday_name;
	}
	
	public String toString() {
		String str = null;
		
		str = this.weekday_ID + "," + this.weekday_name;
		return str;
	}

}
