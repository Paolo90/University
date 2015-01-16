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
public class Lista {
    Elemento testa=null;
    Lista(int n){
        int k=(int)(Math.random()*1000);
        for(int i=0;i<n;i++){
            testa=new Elemento("elemento"+k,testa);
        }
    }
    String cerca(int n){
        Elemento e=testa;
        boolean trovato=false;
        while(trovato==false && e!=null){
            if(e.s.length()>n)
                trovato=true;
            else
                e=e.next;
        }
        if(e!=null)
            return e.s;
        else
            return null; // la stringa è un oggetto.
    }
}
