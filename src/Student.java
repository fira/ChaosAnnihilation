import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ElementNotFoundException;

public class Student {
	private String firstname;
	private String lastname;
	
	private int ranking;
	private boolean repeating;
	
	/* Modelizes the wishes of students for each course slot */
	private HashMap<CoursePool, List<Course>> coursesChoices;

	public Student(String lastname, String firstname, int ranking) {
		this(lastname, firstname, ranking, false);
	}

	public Student(String lastname, String firstname, int ranking, boolean repeating) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ranking = ranking;
		this.repeating = repeating;
		
		this.coursesChoices = new HashMap<>();
	}

	public String getFirstname() { return this.firstname; }
	public String getLastname() { return this.lastname; }
	public int getRank() { return this.ranking; }

	public List<Course> getWishes(CoursePool pool) throw ElementNotFoundException {
		if(!this.courseChoices.contains(pool) 
			{ throw new ElementNotFoundException("Pool " + pool.getName() + " not found"); }
		return this.courseChoices.get(pool);
	}
	public HashMap<CoursePool, List<Course>> getWishesMap() { return this.courseChoices; }

	public boolean isWishingCourse(CoursePool pool, Course course) {
		try { 
			if (this.getWishes(pool).contains(course)) return true;
		} catch (ElementNotFoundException e) { return false; }

		return false;
	}

	public boolean getRepeatStatus() { return this.repeating; }

	/* No setters here: this probably shouldn't change. */
}
