/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4;

/**
 *
 * @author paolo
 */
public class Elemento {
    /**
     * Dato che rappresenta l'informazione
     */
    int valore;
    /**
     * Dato che rappresenta il riferimento all'elemento successivo
     */
    Elemento successivo;
    /**
     * Metodo costruttore
     */
     Elemento (int valore, Elemento successivo){
         this.valore=valore;
         this.successivo=successivo;
     }
}
