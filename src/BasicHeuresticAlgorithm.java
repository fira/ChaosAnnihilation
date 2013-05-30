import java.util.HashMap;
import java.util.List;

public class BasicHeuresticAlgorithm implements HeuresticAlgorithm {
	public String name;
	public List<String> arguments;

	public int getStudentScore(Student student, StudentsGroup group);
	public int getGroupScore(StudentsGroup group);
}
