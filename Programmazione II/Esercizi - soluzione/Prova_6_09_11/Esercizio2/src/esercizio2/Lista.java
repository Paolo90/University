/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio2;

/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null;
    int conta=0;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*10),testa);
            conta++;
        }
    }
    
    Elemento elimina(int n){
        if(n>conta)
            return null;
        else{
            Elemento e=testa;
            for(int i=0;i<n;i++){
                e=e.next;
            }
            return e;
        }
    }    
}
