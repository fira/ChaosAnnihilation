import java.util.HashMap;
import java.util.List;

/* Defines the interface to an algorithm that will sort
 * the current Roster. */
public interface AssignementAlgorithm {
	/* Applies the algorithm to selected roster, and returns
	 * a code indicative of execution status.  */
	public int apply(Roster roster);
	/* Get the algorithm's designation */
	public String getName();
}

