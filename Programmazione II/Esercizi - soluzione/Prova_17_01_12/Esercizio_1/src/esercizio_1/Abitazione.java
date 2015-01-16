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
abstract public class Abitazione {
    double superficie;
    int stanze;
    Abitazione(double superficie, int stanze){
        this.stanze=stanze;
        this.superficie=superficie;
    }
    abstract double valuta();
}
