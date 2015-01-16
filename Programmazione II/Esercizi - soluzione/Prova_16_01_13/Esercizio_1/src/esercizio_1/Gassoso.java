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
public class Gassoso extends Pianeta{
    long massa;
    Gassoso(String nome, int numeroSatelliti, long massa){
        super(nome,numeroSatelliti);
        this.massa=massa;
    }
    double vita(){
        return 0.0;
    }
}
