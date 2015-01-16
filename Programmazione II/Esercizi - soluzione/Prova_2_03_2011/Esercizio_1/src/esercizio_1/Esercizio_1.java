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
        Comico c=new Comico("Jim Carrey",45,20,5000000);
        System.out.println("La probabilità di vittoria di " + c.nome + " è " + c.probabilitaVincita());
        Drammaturgo d=new Drammaturgo("Roberto Benigni",60,10,5);
        System.out.println("La probabilità di vittoria di " + d.nome + " è " + d.probabilitaVincita());
        Archivio a = new Archivio(7);
        System.out.println("Il vincitore è " + a.vincitore(990000));
    }
    
}
