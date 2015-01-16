/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio2bis;

/**
 *
 * @author paolo
 */
public class Esercizio2bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l=new Lista(10);
        l.visualizza(l.testa);
        //l.elimina(5);
        l.visualizza(l.elimina(5));
        
    }
    
}
