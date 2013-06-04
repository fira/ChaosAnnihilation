import java.util.List;

/*	Takes all available students and stuffs them one by one in groups,
	regardless of what they want or their ranking. Everyone gets what the
	first person wanted. The minimum students rule isn't taken in account
	for the last group, and others are filled to max capacity.
	This algorithm is only meant as a proof of concept tool for testing.
*/
public class DumbAssignementAlgorithm implements AssignementAlgorithm {
	/*	
		Nothing much to initialize here.
		Algorithms are however not declared as static because they could
		be stateful, but this one is really dumb and obviously isn't. 
		Could use coroutines for some sort of tuning of the assignement
		precision (one pass per call).
	*/
	DumbAssignementAlgorithm() { };
	
	@Override
	public int apply(Roster roster) {
		/* Iterate through the available students */
		Iterator<Student> stiter = roster.getStudents().iterator();
		StudentsGroup curgroup = null;
		
		while (stiter.hasNext()) {
			Student curst = stiter.next();
			/* Check whether(sp?) we have to create a new group or not */
			if(    (curgroup == null)
			    || (curgroup.getCourse().maxStudents
			        <= curgroup.getStudents().size()) ) {
				curgroup = new StudentsGroup(curst.coursesChoices.get(curst.coursesChoices.keySet().toArray()[0]).get(0));
			}
		/* FIXME FIXME FIXME FIXME 
	  	 Currently only really works for a single Courses Pool. 
	   	 This is because we pick the first one regardless, and
	   	 handle a single group at a time. */
		}
    	}

	@Override
	public String getName() { return "Dumb"; }		 
}
		 
