/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animali14;

/**
 *
 * @author paolo
 */
public class Gatto extends AnimaleDomestico {
    Gatto(String nome, int eta){
        super(nome, eta);
    }
    void verso(){
        System.out.println("Miao! ");
    }

}
