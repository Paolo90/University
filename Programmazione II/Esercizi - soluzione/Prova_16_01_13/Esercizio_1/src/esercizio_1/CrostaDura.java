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
public class CrostaDura extends Pianeta{
    double diametro;
    CrostaDura(String nome, int numeroSatelliti, double diametro){
        super(nome, numeroSatelliti);
        this.diametro=diametro;
    }
    double vita(){
        return diametro/numeroSatelliti;
    }
}
