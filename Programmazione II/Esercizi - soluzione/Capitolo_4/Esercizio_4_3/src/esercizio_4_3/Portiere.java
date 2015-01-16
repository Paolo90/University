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
public class Portiere extends Giocatore{
    int rigoriParati;
    Portiere(String nome, int eta, int rigoriParati){
        super(nome,eta);
        this.rigoriParati=rigoriParati;
    }
    int valore(){
        return 1000000*rigoriParati-1000*eta;
    }
}
