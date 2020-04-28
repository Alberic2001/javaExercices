public class Rectangle extends Figure{
	private double largeur;

	public Rectangle(){
		super();
		this.longueur = 0;
		this.largeur = 0;
	}

	public Rectangle(double longueur, double largeur){
		this.longueur = longueur;
		this.largeur = largeur;
	}

	//Getters et Setters de longueur
	public double getLongueur(){
		return this.longueur;
	}
	public double getLargeur(){
		return this.largeur;
	}

	public void setLongueur(double longueur){
	 	this.longueur = longueur;
	}
	public void setLargeur(double largeur){
	 	this.largeur = largeur;
	}

	//Getters et Setters d'unite
	public static String getUnite(){
		return unite;
	}

	public static void setUnite(String unite){
		Figure.unite = unite;
	}

	public double demiPerimetre(){
		return this.longueur + this.largeur;
	}

	public double surface(){
		return this.longueur * this.largeur;
	}
	public double diagonale(){
		return Math.sqrt(Math.pow(this.longueur, 2.0) + Math.pow(this.largeur, 2.0));
	}
}