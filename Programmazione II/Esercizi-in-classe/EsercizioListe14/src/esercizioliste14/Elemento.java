/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizioliste14;

/**
 *
 * @author paolo
 */
public class Elemento {
    int valore; // 4 byte
    Elemento next; // 4 byte
    public Elemento (int valore, Elemento next){ // metodo costruttore customizzato
        this.valore=valore;
        this.next=next;
    }
}
