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
abstract class Giocatore {
    String nome;
    int eta;
    Giocatore(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }
    abstract int valore();
}
