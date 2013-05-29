import java.util.HashMap;
import java.util.List;

public interface HeuresticAlgorithm {
	public String name;
	public List<String> arguments;

	/* Calculate the heurestic score for a single student placed in a given
	 * students group. Lower values are better */
	public int getStudentScore(Student, StudentsGroup);
	
	/* Calculates the heurestic score for a whole student group */
	public int getGroupScore(StudentsGroup);
}
