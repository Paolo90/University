/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicazionevettore;

/**
 *
 * @author paolo
 */
public class Elemento {
    int valore; // 4 byte
    Elemento next; // 4 byte
    static int conta=0;
    public Elemento (int valore, Elemento next){ // metodo costruttore customizzato
        this.valore=valore;
        this.next=next;
        conta++;
    }

    static int getconta(){
        return conta;
    }
    
    static void stampa(Elemento testa){
        Elemento e;
        for(e=testa;e!=null;e=e.next){
            System.out.print(e.valore);
        }
        System.out.println(" ");
    }
}
