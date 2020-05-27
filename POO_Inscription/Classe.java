public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;

   //Getters and Setters
     public String getNom(){
	return this.nom;
     }
     public void setNom(String nom){
	this.nom = nom;
     }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}