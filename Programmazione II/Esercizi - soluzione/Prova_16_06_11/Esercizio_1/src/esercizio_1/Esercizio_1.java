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
        // TODO code application logic here
        Programma p = new Film("L'ultimo dei Moicani", 11.3, true);
        System.out.println("Titolo: "+p.titolo);
        System.out.println("Spettatori: "+p.spettatori);
        System.out.println("Italiano? "+((Film)p).prodottoInItalia);
        System.out.println("-------------------------");
        p=new Approfondimento("Ballarò", 3.5, true);
        System.out.println("Titolo: "+p.titolo);
        System.out.println("Spettatori: "+p.spettatori);
        System.out.println("Approfondimento politico? "+((Approfondimento)p).approfondimentoPolitico);
        Archivio a = new Archivio(3,5);
        System.out.println("Numero programmi: "+ a.contaProgrammi(433.28));
    }
    
}
