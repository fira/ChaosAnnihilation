import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvParser {
    private File csvFile;
    private Roster roster;
    
    public CsvParser(File csvFile) {
	this.csvFile = csvFile;
	roster = new Roster();
    }
    
    public void retrieveAll() {
	Scanner scanner;
	
	try {
	    scanner = new Scanner(csvFile);
	    
	    String line;
	    Student student;
	    int rankingTemp = 1;
	    while(scanner.hasNext()) {
		line = scanner.next();
		
		String[] studentArgs = line.split(",");
		student = new Student(studentArgs[0], studentArgs[1], rankingTemp);
		rankingTemp++;
	    }
	} catch (FileNotFoundException fnfe) {
		System.out.println(fnfe.getMessage());
	}
    }
    
    public Roster getRoster() {
	return roster;
    }
}