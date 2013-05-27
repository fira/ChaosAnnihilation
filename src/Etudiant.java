import java.util.HashMap;
import java.util.List;

class Etudiant {
	public String prenom;
	public String nom;
	
	public int classement;
	public boolean redoublant;
	
	/* La HashMap associe un slot d'elective a une liste de choix 
	 * associes. On utilise que des strings pour permettre des valeurs
	 * arbitraires */
	public HashMap<String, List<String>> choixElectives;
		
	Etudiant(String nom, String prenom, int classement) {
		this(nom, prenom, classement, false);
	}

	Etudiant(String nom, String prenom, int classement, boolean redoublant) {
		this.prenom = prenom;
		this.nom = nom;
		this.classement = classement;
		this.redoublant = redoublant;

		/* Initialise la HashMap de choix d'electives */
		this.choixElectives = new HashMap<String, List<String>>();
 	}


}

