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
abstract class Attore {
    String nome;
    int eta;
    int numeroFilm;
    Attore(String nome, int eta, int numeroFilm){
        this.nome=nome;
        this.eta=eta;
        this.numeroFilm=numeroFilm;
    }
    abstract double probabilitaVincita();
}
