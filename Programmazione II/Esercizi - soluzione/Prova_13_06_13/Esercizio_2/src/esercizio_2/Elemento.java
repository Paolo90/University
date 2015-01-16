/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_2;

/**
 *
 * @author paolo
 */
public class Elemento {
    String s;
    Elemento next;
    Elemento(String s, Elemento next){
        this.s=s;
        this.next=next;
    }
}
