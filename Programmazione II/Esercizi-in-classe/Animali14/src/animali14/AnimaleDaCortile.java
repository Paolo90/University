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
public class AnimaleDaCortile extends Animale{
    int peso;
    AnimaleDaCortile(int e, int p){
        super(e);
        peso=p;
    }
    void mostra(){
        super.mostra();
        System.out.println("e peso "+peso+" chili");
    }

}
