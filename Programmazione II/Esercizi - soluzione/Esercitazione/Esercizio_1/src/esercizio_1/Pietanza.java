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
abstract class Pietanza {
    String nome;
    int calorie;
    Pietanza(String nome, int calorie){
        this.nome=nome;
        this.calorie=calorie;
    }
    abstract double costo();
}
