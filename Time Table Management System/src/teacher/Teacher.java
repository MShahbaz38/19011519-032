package teacher;

import java.util.ArrayList;
import java.util.List;

import Person.Person;

public class Teacher extends Person {
	private int Teacher_ID;
/*	private String Tea_title;
 * 
 */
	
	List<String> Teachers = new ArrayList<String>();

/*	public String getTea_title() {
		return Tea_title;
	}

	public void setTea_title(String tea_title) {
		Tea_title = tea_title;
	}
*/
	public int getTeacher_ID() {
		return Teacher_ID;
	}

	public void setTeacher_ID(int teacher_ID) {
		Teacher_ID = teacher_ID;
	}
	
	public String toString() {
		String str = null;
		
		str = "" + this.Teacher_ID;
		return str;
	}

}
