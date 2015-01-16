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
        // Provare un main casuale !!!
        Orologio p=new Analogico("Swatch", 25.5);
        System.out.println(p.marca+" "+ p.peso);
        System.out.println(p.costo());
        System.out.println("-------------------------------------------------");
        Orologio q = new Digitale("Tissot", 30.3, 3);
        System.out.println(q.marca+" "+ q.peso+" "+((Digitale)q).voltaggio);
        System.out.println(q.costo());
        System.out.println("-------------------------------------------------");
        Magazzino m=new Magazzino(1,0);
        m.mostra();
        System.out.println("Costo complessivo? "+m.costoComplessivo());
    }
    
}
