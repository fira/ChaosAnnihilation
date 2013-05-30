import java.util.HashMap;
import java.util.List;

class Roster {
	/* List of all students to be considered */
	private List<Student> students;
	/* We could check every student through assignement groups
	 * to know those that aren't in one yet. While using a separate
	 * attribute might be conceptually deficient by design, it is
	 * infinitely more practical */
	private List<Student> remainingStudents;
	/* List of possible courses */
	private List<Course> courses;

	/* List of student groups and their associated courses */
	private List<StudentsGroup> assignement;

	/* Build a new, empty students roster */
	Roster() {
		this.students = new List<Student>;
		this.remainingStudents = new List<Student>;
		this.courses = new List<Course>;
		this.assignement = new List<StudentsGroup>;
	}	
	/* Build a new student roster by copying an existing one */
	Roster(Roster source) {
		/* FIXME: Assume both roster share the same students/courses
		at all times. This should be a real copy, but all in all,
		we don't really need it (yet?). Also speedup things. */
		this.students = source.students;
		this.courses = source.courses;
		
		this.remainingStudents = new List<Student>(source.remainingStudents);
		this.assignement = new List<StudentsGroup>(source.assignement);
	}
	
	/* Resets the roster to an unassigned state */
	public void clearAssignements() { 
		this.remainingStudents = new List<Student>(this.students);
		this.assignement.clear();
	}

	public int getSize() { return this.students.size(); }
}
			
