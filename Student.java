package edu.mhu.cs.johnnyaraya.finalexam;

/**
 * @author Johnny
 *
 */
public class Student {
	//Holds the first name of the student
	private String firstName;
	//Holds the last name of the student
	private String lastName;
	//Holds the number of grades added to this student object
	private int numOfGrades = 0;
	//Holds the sum of all the grades this student object has seen
	private int sumOfGrades = 0;
	
	/**
	 * Constructor for the Student object.
	 */
	public Student(String first, String last) {
		setFirstName(first);
		setLastName(last);
	}
	
	//Method adds a grade to this student object
	public void addGrade(int grade) {
		numOfGrades = grade;
	}
	
	//Returns current sum of grades encountered by this student
	public int getSumOfGrades() { return sumOfGrades; }
	
	//Returns number of grades this student has encountered
	public int getNumOfGrades() {return numOfGrades; }
	
	//Returns the current grade average
	public double getCurrentAverage() {return sumOfGrades/numOfGrades; }
	
	//Return first name of student 
	public String getFirstName() {return firstName;}
	
	//Return last name student
	public String getLastName() { return lastName; }
	
	//Sets the first name of this student
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Sets the last name of this student
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}

	@Override
	public String toString() {
		//String info = String.format("%-15s %6d\n", firstName + " " + lastName + ":	", sumOfGrades );
		String info = "\nStudent Name: " + getFirstName();
		return info;
	}
}
