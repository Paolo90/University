/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_11;

/**
 *
 * @author paolo
 */
public class Portiere extends Giocatore{
    int penalty;
    Portiere(String name, int age, int penalty){
        super(name, age);
        this.penalty=penalty;
    }
    double value(){
        return 1000000*penalty-1000*age;
    }
}
