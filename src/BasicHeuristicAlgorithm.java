import java.util.List;

/* Basic algorithm : iterate through all of the students
 * and sum the square of their wish' position, minus one.
 * Optimal score would be zero, each student getting a second wish 
 * adds one, third wish adds three, etc. */
public class BasicHeuristicAlgorithm implements HeuristicAlgorithm {
	public String name;
    	public List<String> arguments;

    	@Override
    	public String getName() {
		return new String("Basic");
	}
	
	@Override
	public int getStudentScore(Student student, StudentsGroup group)  {
    	/* Get the wishlist for the given course pool */
		if(!student.coursesChoices.contains(group.getPool())) {
			/* Wha?! This guy isn't even following the right course
		 	* pool. Bail out with a high default value. */
			return 20;
		} else 	{
			return (student.courseChoices.get(group.getPool()).indexOf(group.course))^2 - 1;
		}
	}

	@Override
 	public int getGroupScore(StudentsGroup group) {
		Iterator<Student> siter = StudentsGroup.getStudentsIterator();

		int sum = 0;
		while(siter.hasNext()) {
			sum += this.getStudentScore(siter.next(), group);
		}

		return sum;
	}
}
