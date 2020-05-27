import java.time.LocalDate;
public class Etudiant extends Personne{
	private String tuteur;
	private int annee;
	// Propriete navigationnelle;
	private Classe classEtu;

	//Constructeur
	// Par defaut
	public Etudiant(){

	}
	// Surcharge du constructeur
	public Etudiant(String nomComplet, LocalDate dateNaissance, String tuteur, int annee){
		// Initialisation de la personne
		super(nomComplet, dateNaissance);
		this.tuteur = tuteur;
		this.annee = annee;
		
	}

	//Getters et Setters

	// Redefinition de la methode affiche()

	@Override
	public String affiche(){
		//super signifie Personne
		//this signifie etudiant
		return super.affiche() +" Tuteur: "+tuteur+" Annee: "+annee;
	}
}