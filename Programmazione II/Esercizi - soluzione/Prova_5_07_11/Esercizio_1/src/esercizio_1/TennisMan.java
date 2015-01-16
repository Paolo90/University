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
public class TennisMan extends Atleta{
    int tornei_vinti;
    TennisMan(String nome, int eta, int tornei_vinti){
        super(nome,eta);
        this.tornei_vinti=tornei_vinti;
    }
    int punteggio(){
        return tornei_vinti*1000/eta;
    }
}
