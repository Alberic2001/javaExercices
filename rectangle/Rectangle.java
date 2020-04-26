package rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albéric
 */
public class Rectangle {

    /**
     *  Classe Rectangle
     *  Attributs longueur, largeur et unité
     */
    
    //Attributs Instances
            private int largeur; 
            private int longueur; 
          //Attributs classe ou Attributs static
            private static String unite;
            
            public Rectangle(int longueur, int largeur){
                this.longueur = longueur;
                this.largeur = largeur;
    }
            public Rectangle(){
                this.longueur = 0;
                this.largeur = 0;
            }
            // Getters
            public int getLongueur(){
                return this.longueur;
            }
            public int getLargeur(){
                return this.largeur;
            }
            
            // Setters
            public void setLongueur(int longueur){
                this.longueur = longueur;
            }
            public void setLargeur(int largeur){
                this.largeur = largeur;
            }
            
            // stactic functions
            public static String getUnite(){
                return unite;
            }
            public static void setUnite(String unite){
                Rectangle.unite = unite;
            }
            
            // use cases methods
            public int demiPerimetre(){
                return this.longueur + this.largeur;
            }
            public int perimetre(){
                return demiPerimetre() * 2;
            }
            public int surface(){
                return this.longueur * this.largeur;
            }
            public int diagonale(){
                return 0;
            }
}
