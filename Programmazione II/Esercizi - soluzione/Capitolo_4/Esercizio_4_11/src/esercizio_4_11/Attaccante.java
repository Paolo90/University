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
public class Attaccante extends Giocatore{
    int goal;
    Attaccante(String name, int age, int goal){
        super(name, age);
        this.goal=goal;
    }
    double value(){
        return 5000000*goal-5000*age;
    }
}
