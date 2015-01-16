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
public class Verdura extends Pietanza{
    boolean prodottoItaliano;
    Verdura(String nome, int calorie, boolean prodottoItaliano){
        super(nome,calorie);
        this.prodottoItaliano=prodottoItaliano;
    }
    double costo(){
        if(prodottoItaliano==false)
            return (double)calorie+5;
        else
            return
                    (double)calorie;
    }
}
