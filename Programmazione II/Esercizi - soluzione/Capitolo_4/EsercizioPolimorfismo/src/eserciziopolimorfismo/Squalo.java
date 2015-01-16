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
public class Squalo extends Pesce{
    int numeroDenti;

    public Squalo(int numeroDenti, String nome, int eta, double peso, int numeroPinne) {
        super(nome, eta, peso, numeroPinne);
        this.numeroDenti = numeroDenti;
    }
    
    public void verso(){
        System.out.println("Grrrr");
    }
}
