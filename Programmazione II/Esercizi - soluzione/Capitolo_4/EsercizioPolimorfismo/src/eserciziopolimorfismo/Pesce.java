/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziopolimorfismo;

/**
 *
 * @author paolo
 */
abstract public class Pesce extends Animale{
    int numeroPinne;
    Pesce(String nome, int eta, double peso ,int numeroPinne){
        super(nome, eta, peso);
        this.numeroPinne=numeroPinne;
    }
    final public void mangia(double k){
        peso+=k;
    }
}
