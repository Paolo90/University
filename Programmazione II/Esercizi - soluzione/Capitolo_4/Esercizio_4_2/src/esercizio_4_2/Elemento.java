/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_2;

/**
 *
 * @author paolo
 */
public class Elemento {
    int valore;
    Elemento successivo;
    Elemento(int n,Elemento next){
        valore=n;
        successivo=next;
    }
}
