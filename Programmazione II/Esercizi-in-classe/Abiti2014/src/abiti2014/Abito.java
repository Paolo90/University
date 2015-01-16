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
abstract public class Abito {
    int taglia;
    String paese;
    Abito(int taglia, String paese){
        this.paese=paese;
        this.taglia=taglia;
    }
    abstract double costo();
}
