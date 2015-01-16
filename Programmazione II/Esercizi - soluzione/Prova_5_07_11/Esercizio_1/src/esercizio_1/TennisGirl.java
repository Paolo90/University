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
public class TennisGirl extends Atleta{
    double percentuale_vittorie;
    TennisGirl(String nome, int eta, double percentuale_vittorie){
        super(nome,eta);
        this.percentuale_vittorie=percentuale_vittorie;
    }
    int punteggio(){
        return ((int)(percentuale_vittorie))*100-eta;
    }
}
