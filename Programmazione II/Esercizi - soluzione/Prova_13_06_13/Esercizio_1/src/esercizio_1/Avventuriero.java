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
public class Avventuriero extends Viaggiatore{
    int nazioniVisitate;
    Avventuriero(String nome, int giorniVacanza, int nazioniVisitate){
        super(nome,giorniVacanza);
        this.nazioniVisitate=nazioniVisitate;
    }
    int costo(){
        return giorniVacanza * 100 - (10 * nazioniVisitate);
    }
}
