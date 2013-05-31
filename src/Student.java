import java.util.List;
import java.util.ArrayList;

public class Student {
	public String firstname;
	public String lastname;
	
	public int ranking;
	public boolean repeating;
	
	/* Modelizes the wishes of students for each course slot */
	public List<Wishes> coursesChoices;
		
	public Student(String lastname, String firstname, int ranking) {
		this(lastname, firstname, ranking, false);
	}

	public Student(String lastname, String firstname, int ranking, boolean repeating) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ranking = ranking;
		this.repeating = repeating;
		
		this.coursesChoices = new ArrayList<>();
}

}
