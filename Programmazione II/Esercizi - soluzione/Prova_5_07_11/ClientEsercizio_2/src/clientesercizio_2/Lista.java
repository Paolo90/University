/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;

/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*15),testa);
        }
    }
    void stampa(){
        for(Elemento e=testa;e!=null;e=e.successivo){
            System.out.print(e.valore+" ");
        }
        System.out.println("");
    }
    int somma(){
        int S=0;
        for(Elemento e=testa;e!=null;e=e.successivo){
            S+=e.valore;
        }
        return S;
    }
}
