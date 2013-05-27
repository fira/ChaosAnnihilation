import java.util.HashMap;
import java.util.List;

class Student {
	public String firstname;
	public String lastname;
	
	public int classement;
	public boolean redoublant;
	
	/* Modelizes the wishes of students for each course slot */
	public HashMap<String, List<String>> choixElectives;
		
	Student(String lastname, String firstname, int classement) {
		this(lastname, firstname, ranking, false);
	}

	Student(String lastname, String firstname, int ranking, boolean repeating) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ranking = ranking;
		this.repeating = repeating;

		/* Initialize the HashMap of wishes */
		this.coursesWishes = new HashMap<String, List<String>>();
 	}


}

