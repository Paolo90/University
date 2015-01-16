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
public class Carne extends Pietanza{
    double peso;
    Carne(String nome, int calorie, double peso){
        super(nome,calorie);
        this.peso=peso;
    }
    double costo(){
        return calorie+peso*20;
    }
}
