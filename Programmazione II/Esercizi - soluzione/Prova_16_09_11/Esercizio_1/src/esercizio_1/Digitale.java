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
public class Digitale extends Orologio{
    int voltaggio;
    Digitale(String marca, double peso, int voltaggio){
        super(marca, peso);
       this.voltaggio=voltaggio;
    }
    double costo(){
        return 50+voltaggio*10-peso*5;
    }
}
