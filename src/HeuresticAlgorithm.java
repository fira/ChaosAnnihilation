import java.util.HashMap;
import java.util.List;

public interface HeuresticAlgorithm {
	/* Calculate the heurestic score for a single student placed in a given
	 * students group. Lower values are better */
	public int getStudentScore(Student, StudentsGroup);
	
	/* Calculates the heurestic score for a whole student group */
	public int getGroupScore(StudentsGroup);
	
	public String getName();
}
