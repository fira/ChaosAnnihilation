
import java.io.File;

public class ChaosAnnihilation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File test = new File("src/test.csv");
	CsvParser csvParser = new CsvParser(test);
	csvParser.retrieveAll();
    }
}
