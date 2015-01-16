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
        Lista l1=new Lista(10);
        l1.mostra();
        System.out.println("------------------------------");
        Lista l2 = l1.copia(5);
        l2.mostra();
    }
    
}
