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
public class Scultura extends Opera{
    double peso;
    
    Scultura(String autore, int anno, double peso){
        super(autore,anno);
        this.peso=peso;
    }
    
    double costoRestauro(){
        return peso*1.5-anno;
    }
}
