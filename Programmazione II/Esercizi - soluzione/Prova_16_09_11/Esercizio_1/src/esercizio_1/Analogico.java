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
public class Analogico extends Orologio{
    Analogico(String marca, double peso){
        super(marca,peso);
    }
    double costo(){
        return 100+peso*10;
    }
}
