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
public class Approfondimento extends Programma{
    boolean approfondimentoPolitico;
    Approfondimento(String titolo, double spettatori, boolean approfondimentoPolitico){
        super(titolo, spettatori);
        this.approfondimentoPolitico=approfondimentoPolitico;
    }
    double incassoPubblicita(){
        if(approfondimentoPolitico)
            return spettatori*500+2000;
        return spettatori*500;
    }
}
