import java.util.List;

/* Basic algorithm : iterate through all of the students
 * and sum the square of their wish' position, minus one.
 * Optimal score would be zero, each student getting a second wish 
 * adds one, third wish adds three, etc. */
public class BasicHeuresticAlgorithm implements HeuresticAlgorithm {
    public String name;
    public List<String> arguments;

    @Override
    public String getName() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getStudentScore(Student student, StudentsGroup group) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getGroupScore(StudentsGroup group) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
}
