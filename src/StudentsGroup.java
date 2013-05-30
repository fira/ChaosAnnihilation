import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

class StudentsGroup {
	private List<Student> students;
	private Course course;

	/* Initializes the object with an empty list of students */
	StudentsGroup(Course course) {
		this.students = new ArrayList<Student>();
		this.course = course;
	}
	StudentsGroup() { this(null); }

	/* Returns an iterator that can be used to fetch and access all
	 * the students in the group */
	/* FIXME: Probably deficient by design */
	public Iterator<List<Student>> getStudents() {
		return this.students.iterator();
	}

	/* Adds a student to the current group */
	public void addStudent(Student student) {
		this.students.add(student);
	}

	/* Removes a student from this group */
	public void delStudent(Student student) {
		this.students.del(student);
	}

	/* TODO: 
	 *  Swapping functions should use private functions
	 *  so we can add sanity checks to public ones - eg. 
	 *  check that students follows a single course in a slot at any time
	 */	
	/* Swap a student from a foreign group to the current */
	public void changeStudent(Student student, StudentsGroup foreign) {
		foreign.delStudent(student);
		this.addStudent(student);
	}

	/* Swap two students' group */
	public void swapStudents(Student st1, StudentsGroup sg1, Student st2, StudentsGroup sg2) {
		sg1.changeStudent(st1, sg2);
		sg2.changeStudent(st2, sg1);
	}
}
