/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;

/**
 *
 * @author paolo
 */
public class Elemento {
    String nomeThread;
    int totValoriPari=0;
    Elemento next;
    Elemento(String nome, Elemento next){
        nomeThread=nome;
        this.next=next;
    }
}
