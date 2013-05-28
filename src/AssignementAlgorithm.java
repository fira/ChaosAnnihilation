import java.util.HashMap;
import java.util.List;

/* Defines the interface to an algorithm that will sort
 * the current Roster. */
public interface AssignementAlgorithm {
	public String name;
	
	/* List of arguments that can be passed to the algorithm 
	 * This is general and meant to be independant of the implementation */
	public List<String> arguments;

	/* Applies the algorithm to selected roster, and returns
	 * a code indicative of execution status. */
	public int apply(Roster);
}

