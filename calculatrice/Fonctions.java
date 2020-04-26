package calculatrice;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albéric
 */
public class Fonctions {

    /**
     * the command line arguments
     */
    
    public static boolean isEmpty(String nbre){
        if(nbre.isEmpty()){
            return true;
        }
        return false;
    }
    
    public static boolean isNumeric(String nbre){
        try{
            int iNbre = Integer.parseInt(nbre);
            return true;
        } catch(NumberFormatException nfe) {
            return false;
        }
    }
    
}
