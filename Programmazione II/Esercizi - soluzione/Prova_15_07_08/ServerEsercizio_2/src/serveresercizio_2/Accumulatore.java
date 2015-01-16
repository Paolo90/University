/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;

/**
 *
 * @author paolo
 */
public class Accumulatore {
    private int somma=0;
    void setSomma(int n){
        somma+=n;
    }
    int getSomma(){
        return somma;
    }
}
