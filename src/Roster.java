import java.util.ArrayList;
import java.util.LinkedList;

public class Roster {
	/* List of all students to be considered */
	private ArrayList<Student> students;

	/* List of student groups and their associated courses */
	private LinkedList<StudentsGroup> assignement;

	/* Build a new, empty students roster */
	public Roster() {
		this.students = new ArrayList<>();
		this.assignement = new LinkedList<>();
	}	
	
	/* Build a new student roster by copying an existing one 
	 * Only the students and courses are transfered, not
	 * the assignements */
	public Roster(Roster source) {
		/* FIXME: Assume both roster share the same students/courses
		at all times. This should be a real copy, but all in all,
		we don't really need it (yet?). Also speedup things. */
		this.students = source.students;
		this.assignement = new LinkedList<>();
	}
	
	
	/* Resets the roster to an unassigned state */
	public void clearAssignements() {
		this.assignement.clear();
	}

	/* Adds a new student to the list of the ones to consider */
	/* Careful: this does not necesseraly means it will be included
	 * in the assignements list, this is dependant on the algorithm */
	public void addStudent(Student st) {
		this.students.add(st);
	}	

	public List<Student> getStudents() { return this.students; }
	public int getSize() { return this.students.size(); }
}
			
