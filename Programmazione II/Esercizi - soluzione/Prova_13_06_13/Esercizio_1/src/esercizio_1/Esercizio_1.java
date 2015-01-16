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
        Viaggiatore v1;
        v1=new Avventuriero("Marco", 12, 4);
        System.out.print(v1.nome + " ");
        System.out.print("sta fuori per " + v1.giorniVacanza + " giorni ");
        System.out.print("e visita " +  ((Avventuriero)v1).nazioniVisitate + " nazioni");
        System.out.print(" spendendo " + ((Avventuriero)v1).costo() + " €.");
        System.out.println("");
        Viaggiatore v2;
        v2=new Sedentario("Samuele", 20, 5);
        System.out.print(v2.nome + " ");
        System.out.print("sta fuori per " + v2.giorniVacanza + " giorni ");
        System.out.print("in un albergo a " +  ((Sedentario)v2).numeroStelle + " stelle");
        System.out.print(" spendendo " + ((Sedentario)v2).costo() + " €.");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        Archivio a= new Archivio(5,4);
        System.out.println("Il numero di clienti facoltosi è " + a.clientiFacoltosi(3000));
    }
    
}
