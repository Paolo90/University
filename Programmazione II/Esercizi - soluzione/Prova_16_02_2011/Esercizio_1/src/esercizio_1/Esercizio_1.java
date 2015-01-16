/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;

/**
 *
 * @author paolo
 */
public class Esercizio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magazzino m= new Magazzino(5,10);
        System.out.println("La media dei costi degli elettrodomestici di marca marca5 è: "+m.media("marca5")+" €");
    }
    
}
