import java.util.List;
import java.util.ArrayList;

/* Modelizes the wishes of a student for a particular courses slot
 * This is essentially a list of the courses that he might wish to follow
 */
public class Wishes {
	public List<Course> list;

	public Wishes() {
		/* Simply init with a blank list */
		this.list = new ArrayList<Course>();
        }
	
	public add(Course c) {
		this.list.add(c);
	}

        public int getSize() { return this.list.size(); }
}
