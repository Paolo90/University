/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_2;

/**
 *
 * @author paolo
 */
public class Esercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l1=new Lista();
        l1.leggiFile(15, "esame.txt");
        l1.stampa();
        System.out.println("Il prodotto degli elementi è divisibile per tre? " + l1.testDivTre(l1.testa));
    }
    
}
