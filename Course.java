package edu.mhu.cs.johnnyaraya.finalexam;
import java.util.ArrayList;

/**
 * @author Johnny
 *
 */
public class Course {
	//Holds the name of the course
	private String courseName;
	
	//ArrayList holds all of the students enrolled in the course
	private ArrayList<Student>	studentList = new ArrayList<Student>();
	
	//Holds the name of the teacher
	private String teacherName;
	
	//Constructor for the Course class.
	public Course(String courseName, String teacherName) {
		setCourseName(courseName);
		setTeacherName(teacherName);
	}
	
	//Returns an ArrayList of Student objects of those Students who are enrolled in this course
	public ArrayList<Student> getStudentArrayList() {
		return studentList;
	}
	
	//Returns a string holding the Course object, with students sorted by Average Grade
	public String toStringSortedByAverageGrade() {
		String tostr = null;
		for(Student student : studentList) {
			tostr += student;
		}
		return tostr;
	}
	
	//
	boolean	enrollStudent(Student s) {
		try {
			studentList.add(s);
			return true;
		} catch(Exception err) {
			System.err.print(err);
			return false;
		}
	}
	
	
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @return the studentList
	 */
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		String tostr = null;
		tostr += "Class : " + getCourseName() + " \nTeacher: " + getTeacherName() + "\nClass Size: " +  getNumEnrolled();
		tostr += "\nTeacher: " + getTeacherName();
		for(Student student : studentList) {
			tostr += student;
		}
		return tostr;
	}

	/*
	 * Returns Number of students
	 */
	private int getNumEnrolled() {
		return studentList.size();
	}

}
