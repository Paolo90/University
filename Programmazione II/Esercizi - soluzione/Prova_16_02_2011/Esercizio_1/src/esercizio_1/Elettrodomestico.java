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
abstract class Elettrodomestico {
   String nome;
   String marca;
   int potenza;
   Elettrodomestico(String nome, String marca, int potenza){
       this.nome=nome;
       this.marca=marca;
       this.potenza=potenza;
   }
   abstract int costo();
}
