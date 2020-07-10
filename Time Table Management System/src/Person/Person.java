package Person;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int Person_ID;
	private String Title;
	private String f_name;
	private String l_name;
	private String Occupation;
	
	
	List<String> Persons = new ArrayList<String>();
	
	public int getPerson_ID() {
		return Person_ID;
	}
	public void setPerson_ID(int person_ID) {
		Person_ID = person_ID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	
	public String toString() {
		String str = null;
		
		str = this.Person_ID + "," + this.f_name + "," + this.l_name + "," + this.Title + ","
				+ this.Occupation;
		return str;
	}

}
