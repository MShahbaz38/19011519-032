package Course;

import java.util.ArrayList;
import java.util.List;

public class Course{
	private int Course_Code;
	private String Course_Name;
	private float Credit_hour;
	private int Course_ID;
	private int	courseprerquist_ID;
	private String Course_desc;
	
	
	public String getCourse_desc() {
		return Course_desc;
	}
	public void setCourse_desc(String course_desc) {
		Course_desc = course_desc;
	}
	public int getCourse_Code() {
		return Course_Code;
	}
	public void setCourse_Code(int course_Code) {
		Course_Code = course_Code;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public float getCredit_hour() {
		return Credit_hour;
	}
	public void setCredit_hour(float credit_hour) {
		Credit_hour = credit_hour;
	}
	public int getCourse_ID() {
		return Course_ID;
	}
	public void setCourse_ID(int course_ID) {
		Course_ID = course_ID;
	}
	public int getCourseprerquist_ID() {
		return courseprerquist_ID;
	}
	public void setCourseprerquist_ID(int courseprerquist_ID) {
		this.courseprerquist_ID = courseprerquist_ID;
	}

	public String toString() {
		String str = null;
		
		str = this.Course_ID + "," + this.Course_Code + "," + this.Course_Name + "," + this.Course_desc + ","
				+ this.Credit_hour + "," + this.courseprerquist_ID;
		return str;
	}


}
