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
public class Drammaturgo extends Attore{
    int nomination;
    Drammaturgo(String nome, int eta, int numeroFilm, int nomination){
        super(nome,eta,numeroFilm);
        this.nomination=nomination;
    }
    double probabilitaVincita(){
        return (double)(nomination*eta)/numeroFilm;
    }
}
