/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;

/**
 *
 * @author paolo
 */
public class Elemento {
    static int numeroElementi=0;
    int valore;
    Elemento successivo;
    Elemento(int val, Elemento suc){
        valore=val;
        successivo=suc;
        numeroElementi++;
    }
}
