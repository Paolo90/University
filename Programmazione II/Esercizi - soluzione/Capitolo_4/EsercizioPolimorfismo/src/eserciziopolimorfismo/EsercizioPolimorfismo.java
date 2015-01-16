/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziopolimorfismo;

/**
 *
 * @author paolo
 */
public class EsercizioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animale a;
        a=new Squalo(70, "Snappy", 40, 100, 4);
        System.out.println("Numero pinne = "+((Pesce)a).numeroPinne);
        a.verso(); /* Uso il late binding */
        System.out.println("L'animale "+a.nome+" mangia.");
        ((Pesce)a).mangia(10.3);
        System.out.println(a.nome+" ora pesa "+a.peso);
    }
    
}
