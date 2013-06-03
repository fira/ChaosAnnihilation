import java.util.List;
import java.util.ArrayList;

public class Student {
	private String firstname;
	private String lastname;
	
	private int ranking;
	private boolean repeating;
	
	/* Modelizes the wishes of students for each course slot */
	private HashMap<CoursePool, Wishes> coursesChoices;

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
	public boolean getRepeatStatus() { return this.repeating; }

	/* No setters here: this probably shouldn't change. */
}
