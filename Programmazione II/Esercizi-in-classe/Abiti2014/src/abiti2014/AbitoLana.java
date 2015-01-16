/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abiti2014;

/**
 *
 * @author paolo
 */
public class AbitoLana extends Abito{
    boolean lanaVergine;
    AbitoLana(int taglia, String paese, boolean lanaVergine){
        super(taglia,paese);
        this.lanaVergine=lanaVergine;
    }
    double costo(){
        if(lanaVergine)
            return 100.0;
        return 80.0;
        // la scrivo anche con l'operatore ternario di selezione
        // return(lanaVergine?100:80); se lanaVergine è vero restituisco 100 sennò 80
    }
}
