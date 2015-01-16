/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;

/**
 *
 * @author paolo
 */
public class Elemento {
    int valore;
    Elemento successivo;
    Elemento(int valore, Elemento successivo){
        this.valore=valore;
        this.successivo=successivo;
    }
}
