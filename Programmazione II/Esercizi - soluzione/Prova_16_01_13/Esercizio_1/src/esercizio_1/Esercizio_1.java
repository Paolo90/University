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
        Pianeta p1;
        p1 = new CrostaDura("Saturno", 30, 3000.43);
        System.out.println("Il pianeta "+p1.nome+" ha "+p1.numeroSatelliti+" satelliti e ha un diametro di "+((CrostaDura)p1).diametro);
        System.out.println("La speranza di trovare vita su "+p1.nome+" è "+p1.vita()); // late binding
        Gassoso p2;
        p2 = new Gassoso("Venere", 0, 8000);
        System.out.println("Il pianeta "+p2.nome+" ha "+p2.numeroSatelliti+" satelliti e ha una massa di "+p2.massa);
        System.out.println("La speranza di trovare vita su "+p2.nome+" è "+p2.vita()); // late binding
        Osservatorio o;
        o=new Osservatorio(9);
        System.out.println("Ci sono "+o.trovaVita(100)+" pianeti in cui si può trovare vita.");
    }
    
}
