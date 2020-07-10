package student;

import Person.Person;

public class Student extends Person {
	private int Student_ID;
	private String st_rollno;
	private String major;
	private int en_year;
	

	public String getSt_rollno() {
		return st_rollno;
	}

	public void setSt_rollno(String st_rollno) {
		this.st_rollno = st_rollno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getEn_year() {
		return en_year;
	}

	public void setEn_year(int en_year) {
		this.en_year = en_year;
	}

	public int getStudent_ID() {
		return Student_ID;
	}

	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	
	public String toString() {
		String str = null;
		
		str = this.Student_ID + "," + this.st_rollno + "," + this.major + "," + this.en_year;
		return str;
	}

}
