public interface HeuresticAlgorithm {
	/* Calculate the heurestic score for a single student placed in a given
	 * students group. Lower values are better */
	public int getStudentScore(Student student, StudentsGroup group);
	
	/* Calculates the heurestic score for a whole student group */
	public int getGroupScore(StudentsGroup group);
	
	public String getName();
}
