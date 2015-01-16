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
abstract class Pianeta {
    String nome;
    int numeroSatelliti;
    Pianeta(String nome, int numeroSatelliti){
        this.nome=nome;
        this.numeroSatelliti=numeroSatelliti;
    }
    abstract double vita();
}
