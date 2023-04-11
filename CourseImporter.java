package edu.mhu.cs.johnnyaraya.finalexam;
import java.util.ArrayList;

/**
 * @author Johnny
 *
 */
public class CourseImporter {
	
	//Holds all the courses read from files
	private ArrayList<Course> courseList = new ArrayList<Course>();
	
	public CourseImporter() {
	}

	//Method reads the given filename, and creates a course object full of students
	public void readCourseFile(String url) {
		
		//Reads data from URL
		NetworkFileReaderUtility networkUtil = new NetworkFileReaderUtility();
		networkUtil.readFile(url);
		
		//Creates a string for the class name
		String className; 
		className = networkUtil.getNextLine();
		
		//Creates string for teacher's name
		String teacherName;
		teacherName = networkUtil.getNextLine();
		Course course = new Course(className, teacherName);
		
		//Creates string for students's name
		String studentName;
		studentName = networkUtil.getNextLine();
		
		/* 
		 * Creates object with student's name
		 * Don't know how to split name
		 */
		Student student = new Student(studentName, studentName); 
		course.enrollStudent(student);
		String line = null;
		
		/*
		 * Get grades after getting class, teacher, and student 
		 * Don't know how to keep looping for other students
		 */
		while((line = networkUtil.getNextLine()) != null) {
			//will stop when -1 is read
			if(line.equals("-1")) {
				break;
			}else {
				student.addGrade(Integer.parseInt(line));
			}
		}
		courseList.add(course);
	}
	
	//Print each course, with the students in each course sorted by Average Grade
	public String printInAverageGradeOrder() {
		
		//courseList.sort(new GradeAverageComparator());
		String myString = "";
		for(Course course : courseList) {
			myString += course;
		}
		return myString;
	}
	
	//Print each course, with the students in each course sorted by student name
	public String printInNameOrder() {
		//courseList.sort(new NameComparator());
		String myString = "";
		for(Course course : courseList) {
			myString += course;
		}
		return myString;
	}

	public ArrayList<Course> getCoursList() {
		return courseList;
	}

	public void setCoursList(ArrayList<Course> coursList) {
		this.courseList = coursList;
	}

}
