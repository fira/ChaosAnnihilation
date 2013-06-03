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
	    scanner.useDelimiter(",");
	
	    Student student;
	    String firstnameTemp;
	    String lastnameTemp;
	    int rankingTemp = 1;

	    while(scanner.hasNext()) {
		firstnameTemp = scanner.next();
		lastnameTemp = scanner.next();
		
		student = new Student(lastnameTemp, firstnameTemp, rankingTemp);
		roster.addStudent(student);
		
		rankingTemp++;
	    }
	} catch (FileNotFoundException fnfe) {
	    System.out.println(fnfe.getMessage());
	}
    }
}