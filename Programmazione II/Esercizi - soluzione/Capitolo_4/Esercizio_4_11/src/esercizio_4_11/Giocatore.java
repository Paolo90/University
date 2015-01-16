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
abstract public class Giocatore {
    String name;
    int age;
    Giocatore(String name, int age){
        this.age=age;
        this.name=name;
    }
    abstract double value();
}
