import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Roster {
	/* List of all students to be considered */
	private ArrayList<Student> students;
	/* We could check every student through assignement groups
	 * to know those that aren't in one yet. While using a separate
	 * attribute might be conceptually deficient by design, it is
	 * infinitely more practical */
	private LinkedList<Student> remainingStudents;
	/* List of possible courses */
	private ArrayList<Course> courses;

	/* List of student groups and their associated courses */
	private LinkedList<StudentsGroup> assignement;

	/* Build a new, empty students roster */
	Roster() {
		this.students = new ArrayList<Student>();
		this.remainingStudents = new LinkedList<Student>();
		this.courses = new ArrayList<Course>();
		this.assignement = new LinkedList<StudentsGroup>();
	}	
	
	/* Build a new student roster by copying an existing one 
	 * Only the students and courses are transfered, not
	 * the assignements */
	Roster(Roster source) {
		/* FIXME: Assume both roster share the same students/courses
		at all times. This should be a real copy, but all in all,
		we don't really need it (yet?). Also speedup things. */
		this.students = source.students;
		this.courses = source.courses;
		
		this.remainingStudents = new LinkedList<Student>(this.students);
		this.assignement = new LinkedList<StudentsGroup>();
		}
	}
	
	/* Resets the roster to an unassigned state */
	public void clearAssignements() {
		this.remainingStudents = new LinkedList<Student>(this.students);
		this.assignement.clear();
	}

	public int getSize() { return this.students.size(); }
}
			
