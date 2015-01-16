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
public class Comico extends Attore{
    long incasso;
    Comico(String nome, int eta, int numeroFilm, long incasso){
        super(nome,eta,numeroFilm);
        this.incasso=incasso;
    }

double probabilitaVincita(){
        return (double)incasso/eta;
    }
}
