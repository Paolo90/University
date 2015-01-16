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
public class Pittura extends Opera{
    double superficie;
    
    Pittura(String autore, int anno, double superficie){
        super(autore,anno);
        this.superficie=superficie;
    }
    
    double costoRestauro(){
        return superficie + 3000 - anno;
    }
}
