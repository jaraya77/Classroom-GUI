package edu.mhu.cs.johnnyaraya.finalexam;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author Johnny
 *
 */
public class GradeAverageComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getCurrentAverage() > s2.getCurrentAverage()) return -1;
		if (s1.getCurrentAverage() < s2.getCurrentAverage()) return 1;
		return 0;
		
	}

}
