import java.util.HashMap;
import java.util.List;

class StudentsGroup {
	private List<Student> students;
	private Course course;

	/* Initializes the object with an empty list of students */
	StudentsGroup(Course course) {
		this.students = new List<Student>;
		this.course = course;
	}
	StudentsGroup() { this(null); }

	/* Returns an iterator that can be used to fetch and access all
	 * the students in the group */
	/* FIXME: Possibly deficient by design */
	public Iterator<List<Student>> getStudents() {
		return this.students.iterator();
	}

	/* Adds a student to the current group */
	public void addStudent(Student student)
		this.students.add(student);
	}

	/* Removes a student from this group */
	public void delStudent(Student student) {
		this.students.del(student);
	}

	/* TODO: 
	 *  Swapping functions should avoid using the public functions 
	 *  so we can add sanity checks to them - eg. checking that a student
	 *  follows a single course in a given slot at any time
	 *  Solutions: hardcode operation, or create additional private
	 *  function then rewrite the public ones as wrappers.
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
