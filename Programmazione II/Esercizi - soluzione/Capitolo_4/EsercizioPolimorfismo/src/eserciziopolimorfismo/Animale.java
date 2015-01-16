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
abstract public class Animale {
    String nome;
    int eta;
    double peso;
    Animale(String nome, int eta, double peso){
        this.nome=nome;
        this.eta=eta;
        this.peso=peso;
    }
    abstract public void verso();
}
