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
abstract public class Orologio {
    String marca;
    double peso;
    Orologio(String marca, double peso){
        this.marca=marca;
        this.peso=peso;
    }
    abstract double costo();
}
