import java.util.List;
import java.util.ArrayList;

/* Modelizes the wishes of a student for a particular courses slot
 * This is essentially a list of the courses that he might wish to follow
 */
public class Wishes {
	public List<Course> list;
	public CoursePool pool;

	public Wishes(CoursePool pool) {
		/* Simply init with a blank list */
		this.pool = pool;
		this.list = new ArrayList<Course>();
        }
	
	public void add(Course c) {
		this.list.add(c);
	}

        public int getSize() { return this.list.size(); }
}
