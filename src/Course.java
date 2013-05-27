import java.util.Hashmap;
import java.util.List;

class Course {
	/* Used for identifcation in HashMaps.
	 * This is not necessarily the displayed names */
	public String slotId;
	public String nameId; 

	/* Student groups that can enter this course
	 * along with the student range in each group */
	public int maxGroups;
	public int minStudents;
	public int maxStudents;


	Course(String slot, String name) {
		this(slot, name);
	}	
	Course(String slot, String name, int maxGroups) {
		this(slot, name, maxGroups, 20, 24); 
	}
	Course(String slot, String name, int maxGroups, minStudents, maxStudents) {
		this.slotId = slot;
		this.nameId = name;
		this.maxGroups = maxGroups;
		this.minStudents = minStudents;
		this.maxStudents = maxStudents; 
	}

}
