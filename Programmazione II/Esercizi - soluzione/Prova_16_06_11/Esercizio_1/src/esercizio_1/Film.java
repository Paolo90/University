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
public class Film extends Programma{
    boolean prodottoInItalia;
    Film(String titolo, double spettatori, boolean prodottoInItalia){
        super(titolo, spettatori);
        this.prodottoInItalia=prodottoInItalia;
    }
    double incassoPubblicita(){
        if(prodottoInItalia)
            return spettatori*1000+100;
        return spettatori*1000;
    }
}
