import java.util.HashMap;
import java.util.List;

class Roster {
	/* List of all students to be considered */
	private List<Student> students;
	private List<Student> remainingStudents;

	/* Lists of students based on available courses 
	 * Associates a course' identifier to a list of different groups
	 * Ie. a single course can have several student groups  */
	private HashMap<String, List<List<Students>> courses;


	/* The roster score is calculated depending on the students 
	 * distribution that was attained during this pass.
	 * This serves us as an indicator to weigh different student rosters.
	 * A lower score is closer to an optimal distribution */
	private int score;
	/* Wether or not to recalculate the roster score
	 * This is necessary after changing the students' data */
	private boolean scoreUpdate;


	/* Set to true once an algorithm has been applied on our input.
	 * This prevents outputting invalid results */
	private boolean processed;

	
	/* FIXME : Blank class builder */
	Roster();


	/* TODO: We should be able to apply arbitrary algorithms to the roster without
	 * having to recompile everything => use interfaces */
	/* Starts processing of the students list and attempt to simply fill the students 
	 * in all possible groups. We can later rearrange them as needed. 
	 * This should be fairly simple while providing a relatively good head start. */
	public void stage1() {
	
	}


	/* TODO: Ideally the weighing algorithm should also be arbitrary */
	/* Calculates the current roster's score based on student wishes 
	 * and other target goals. */	
	private void updateScore() {
		/* Dumb algorithm : iterate through all of the students
		 * and sum the square of their wish' position, minus one.
		 * Optimal score would be zero, each student getting a second wish 
		 * adds one, third wish adds three, etc. */
	}


	public int getSize() { return this.students.size(); }
	public int getScore() { 
		if(scoreUpdate) this.updateScore();
		return this.score;
	}
}
			
