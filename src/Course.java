import java.util.Hashmap;
import java.util.List;

/* Carracterises a course that can be followed by one or several
 * StudentGroups. The algorithms can then construct a Roster by assembling
 * students in groups following these courses.
  */
class Course {
	/* Used for identification of courses filling the same planning slot 
	 * Be careful of mistypings ! */
	public String slotId;
	/* User designation of the course, used for display */
	public String name; 

	/* Student groups that can enter this course
	 * along with the student range in each group */
	public int maxGroups;
	public int minStudents;
	public int maxStudents;

	Course(String slot, String name) {
		this(slot, name);
	}	
	Course(String slot, String name, int maxGroups) {
		this(slot, name, maxGroups, 16, 24); 
	}
	Course(String slot, String name, int maxGroups, minStudents, maxStudents) {
		this.slotId = slot;
		this.name = name;
		this.maxGroups = maxGroups;
		this.minStudents = minStudents;
		this.maxStudents = maxStudents; 
	}
}
