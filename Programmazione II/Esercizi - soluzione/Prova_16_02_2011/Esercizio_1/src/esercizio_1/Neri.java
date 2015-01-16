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
public class Neri extends Elettrodomestico{
   boolean digitale;
   Neri(String nome, String marca, int potenza, boolean digitale){
       super(nome,marca,potenza);
       this.digitale=digitale;
   }
   int costo(){
       if(digitale==true)
           return 10*potenza+50;
       else
           return 10*potenza;
   }
}
