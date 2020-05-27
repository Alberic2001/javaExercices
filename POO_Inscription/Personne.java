import java.time.LocalDate;
import java.time.Period;
public abstract class Personne implements IInscription{

   //Auto généré
    protected int id;
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;

    public Personne (String nomComplet,
               LocalDate dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss;
     //Initialisé ID
       this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
    }

   //Getters and Setters
	public String getNomComplet(){
		return this.nomcomplet;
	}
	public void setNomComplet(String nomComplet){
		this.nomcomplet = nomComplet;
	}

	public LocalDate getDateNaiss(){
		return this.dateNaiss;
	}
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss = dateNaiss;
	}

	public LocalDate getAge(){
		return this.age;
	}
	public void setAge(String age){
		this.age = age;
	}


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculAge(){
      LocalDate currentDate = LocalDate.now();
      return Period.between(dateNaiss, currentDate).getYears();
   }

}