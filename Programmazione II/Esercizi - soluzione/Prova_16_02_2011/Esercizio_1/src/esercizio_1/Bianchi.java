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
public class Bianchi extends Elettrodomestico{
    int classeEcologica;
    Bianchi(String nome, String marca, int potenza, int classeEcologica){
        super(nome,marca,potenza);
        this.classeEcologica=classeEcologica;
    }
    int costo(){
        return 5*potenza+50*classeEcologica;
    }
}
