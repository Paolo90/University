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
public class Sedentario extends Viaggiatore{
    int numeroStelle;
    Sedentario(String nome, int giorniVacanza, int numeroStelle){
        super(nome, giorniVacanza);
        this.numeroStelle=numeroStelle;
    }
    int costo(){
        return giorniVacanza*150+(20*numeroStelle);
    }
}
