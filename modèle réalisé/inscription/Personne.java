import java.time.LocalDate;
public abstract class Personne implements IInscription{
	protected Integer id;
	protected String nomComplet;
	protected LocalDate dateNaissance;
	protected int age;
	// Constructeurs
	public Personne(){
		// Initialiser Id
	}
	public Personne(String nomComplet, LocalDate dateNaissance){
		this.nomComplet = nomComplet;
		this.dateNaissance = dateNaissance;
		// Initialiser Id
		this.age = calculAge();
	}
	// Getters et Setters
	public String getNomComplet(){
		return this.nomComplet;
	}
	public void setNomComplet(String nomComplet){
		this.nomComplet = nomComplet;
	}

	public LocalDate getDateNaissance(){
		return this.dateNaissance;
	}
	public void setDateNaissance(String dateNaissance){
		this.dateNaissance = LocalDate.parse(dateNaissance);
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}

	//redefinition de la methode affiche()
	@Override
	public String affiche(){
		return "Id: "+id.toString()+" Nom et Prenom : "+nomComplet+" Date de naissance:"+ this.dateNaissance.toString();
	}

	private int calculAge(){
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int birthYear = this.dateNaissance.getYear();
		int age = currentYear - birthYear;
		return age;
	}

}