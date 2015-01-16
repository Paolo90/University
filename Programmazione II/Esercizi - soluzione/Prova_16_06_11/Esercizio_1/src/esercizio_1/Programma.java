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
public abstract class Programma {
    String titolo;
    double spettatori;
    Programma(String titolo, double spettatori){
        this.titolo=titolo;
        this.spettatori=spettatori;
    }
    abstract double incassoPubblicita();
}
