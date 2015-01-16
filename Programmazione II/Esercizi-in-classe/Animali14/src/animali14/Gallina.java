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
public class Gallina extends AnimaleDaCortile{
    Gallina(int eta, int peso){
        super(eta,peso);
    }
    void verso(){
        System.out.println("Coccode! ");
    }

}
