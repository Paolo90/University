/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abiti2014;

/**
 *
 * @author paolo
 */
public class AbitoCotone extends Abito{
    int bottoni;
    AbitoCotone(int taglia, String paese, int bottoni){
        super(taglia, paese);
        this.bottoni=bottoni;
    }
    double costo(){
        if(bottoni>5)
            return 60.0;
        return 50.0;
    }
}
