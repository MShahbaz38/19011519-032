package Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourseData {
	private String csvfile2 = "C:\\Users\\shahb\\workspace\\Time Table Management System\\src\\Course";

	
	
	public String getCsvfile2() {
		return csvfile2;
	}



	public void setCsvfile2(String csvfile2) {
		this.csvfile2 = csvfile2;
	}



	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		String line1;
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(this.csvfile2));
			while((line1 = br1.readLine()) != null) {
				Course course = new Course();
				String[] coursecolumn = line1.split(",");
				
				course.setCourse_ID(Integer.parseInt(coursecolumn[0]));
				course.setCourse_Code(Integer.parseInt(coursecolumn[1]));
				course.setCourse_Name((coursecolumn[2]));
				course.setCourse_desc((coursecolumn[3]));
				course.setCredit_hour(Integer.parseInt(coursecolumn[4]));
				course.setCourseprerquist_ID(Integer.parseInt(coursecolumn[0]));
				
				courses.add(course);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return courses;
	}

}
