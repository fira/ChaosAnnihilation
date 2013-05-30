import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Student {
	public String firstname;
	public String lastname;
	
	public int ranking;
	public boolean repeating;
	
	/* Modelizes the wishes of students for each course slot */
	public List<List<Course>> courseChoice;
		
	Student(String lastname, String firstname, int classement) {
		this(lastname, firstname, ranking, false);
	}

	Student(String lastname, String firstname, int ranking, boolean repeating) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ranking = ranking;
		this.repeating = repeating;
		
		this.coursesChoice = new ArrayList<List<Course>>();
}

}
