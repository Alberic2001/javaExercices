import java.util.Scanner;
//System.out => Ecran
//System.in => Clavier
public class Main{
	
	public static void main(String args[]){
		/*
		System.out.print("Bonjour à tous");
		System.out.println("les etudiants de la GLRS et MAE ");

		//Scanner clavier pour lire les données tapées au clavier
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot");
		//Lire une donnée de type chaine
		String prenom = clavier.next();
		System.out.println("Bonjour "+prenom);
		System.out.println("Veuillez saisir un entier");
		//type primitifs ou de donnees => int, float, double, char, boolean
		//classes wrappers ou enveloppes => Integer, Float, Double, 			
		//Character, Boolean
		System.out.println("Veuillez saisir un entier");
		int x = clavier.nextInt();
		*/

		Rectangle rect1 = new Rectangle();
		System.out.println(rect1.getLongueur());
		System.out.println(rect1.getLargeur());

		Rectangle rect2 = new Rectangle(12, 5);
		System.out.println(rect2.getLongueur());
		System.out.println(rect2.getLargeur());
		System.out.println(rect2.perimetre());
		System.out.println(rect2.diagonale());

	}
}