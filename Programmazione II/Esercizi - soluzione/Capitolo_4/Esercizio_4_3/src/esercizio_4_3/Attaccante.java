/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_3;

/**
 *
 * @author paolo
 */
public class Attaccante extends Giocatore{
    int golSegnati;
    Attaccante(String nome, int eta, int golSegnati){
        super(nome,eta);
        this.golSegnati=golSegnati;
    }
    int valore(){
        return 5000000*golSegnati-5000*eta;
    }
}
