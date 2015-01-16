/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziovettore14;

/**
 *
 * @author paolo
 */
public class EsercizioVettore14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VettoreInteri v = new VettoreInteri(10);
        v.visualizza();
        System.out.println("La media è "+ v.media());
        System.out.println("La posizione di 5 è:"+v.ricercaIndice(5));
        System.out.println("La posizione di 5 è:"+v.ricercaConWhile(5));
        System.out.println("L'elemento 5 compare "+v.contaValore(5)+ " volta/e");
        //v.ordina(); //metodo bubblesort
        //v.quicks(); //metodo quicksort
        //v.quicksOttimizzato(); //metodo quicksort ottimizzato
        v.quicksortNR(); //metodo quicksort non ricorsivo
        v.visualizza();
        System.out.println("La posizione di 100 nel vettore ordinato è " + v.cercaSuOrdinato(100));
        System.out.println("La posizione di 5 nel vettore ordinato è " + v.ricercaBinariaRic(5));
        //v.hanoi(5);
    }
    
}
