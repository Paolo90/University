/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizioliste14;

/**
 *
 * @author paolo
 */
public class Coda extends Lista{
    Elemento ultimo = null; 
    
    public Coda(){ // produce una struttura vuota
        super(0);
        
    }
    
    public void inserisci(int n){
        if(ultimo == null){
            ultimo = new Elemento(n,null);
            testa =ultimo; // perché ho un solo elemento che è contemporaneamente il primo e l'ultimo
        }else{
            ultimo.next=new Elemento(n,null);
            ultimo=ultimo.next;
        }
    }
    
    public Elemento estrazione(){ // restituisce elemento estratto in testa
        Elemento e=testa;
        if(testa != null){
            testa = testa.next;
            if(testa == null)
                ultimo = null; // quando estraggo ultimo elemento
        }   
        return e;
    }
}
