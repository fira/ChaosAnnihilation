import java.util.HashMap;
import java.util.List;

class Roster {
	/* List of all students to be considered */
	private List<Student> students;
	private List<Student> remainingStudents;

	/* Lists of students based on available courses 
	 * Associates a course' identifier to a list of different groups
	 * Ie. a single course can have several student groups  */
	private HashMap<String, List<List<Student>> courses;


	/* The roster score is calculated depending on the students 
	 * distribution that was attained during this pass.
	 * This serves us as an indicator to weigh different student rosters.
	 * A lower score is closer to an optimal distribution */
	private int score;
	/* Wether or not to recalculate the roster score
	 * This is necessary after changing the students' data */
	private boolean scoreUptodate;

	/* Set to true once an algorithm has been applied on our input.
	 * This prevents outputting invalid results */
	private boolean processed;

	
	/* FIXME : Blank class builder */
	Roster();

	public int getSize() { return this.students.size(); }
	public int getScore() { 
		if(scoreUptodate) this.updateScore();
		return this.score;
	}
}
			
