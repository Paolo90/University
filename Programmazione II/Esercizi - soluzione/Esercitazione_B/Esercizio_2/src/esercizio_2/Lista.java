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
    int lunghezza=0;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*10),testa);
            lunghezza++;
        }
    }
    Lista copia(int N){
        Lista l=new Lista(this.lunghezza);
        Elemento testaNuova=l.testa;
        Elemento testaVecchia=testa;
        Elemento e,f;
        e=testaNuova;
        f=testaVecchia;
        while(e!=null){
            if(e.valore != f.valore)
                e.valore=f.valore;
            e=e.successivo;
            f=f.successivo;
        }
        //l.mostra();
        e=testaNuova;
        while(e!=null && e.valore<=N){
            e=e.successivo;
        }
        l.testa=e;  // alla fine ottengo il primo elemento "buono"
        if(e==null) 
            return l; // se è andata male esco subito senza eseguire il resto del blocco
        while(e!=null){
            f=e.successivo;
            while(f!=null && f.valore<=N){
                f=f.successivo;
            }
            e.successivo=f;
            e=f;
        }
        return l;
    }
    void mostra(){
        Elemento e=testa;
        System.out.print("[ ");
        if(e==null){
            System.out.print("");
        }else{
            for(;e!=null;e=e.successivo){
                System.out.print(e.valore+" ");
            }
        }
        System.out.println("]");
    }
}
