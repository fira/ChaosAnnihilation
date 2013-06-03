/* Carracterises a course that can be followed by one or several
 * StudentGroups. The algorithms can then construct a Roster by assembling
 * students in groups following these courses. */
public class Course {
	/* User designation of the course, used for display */
	public String name; 

	/* Student groups that can enter this course
	 * along with the student range in each group */
	public int maxGroups;
	public int minStudents;
	public int maxStudents;

	public Course(String name) {
		this(name, 1);
	}	
        
	public Course(String name, int maxGroups) {
		this(name, maxGroups, 16, 24); 
	}
        
	public Course(String name, int maxGroups, int minStudents, int maxStudents) {
		this.name = name;
		this.maxGroups = maxGroups;
		this.minStudents = minStudents;
		this.maxStudents = maxStudents; 
	}
}
