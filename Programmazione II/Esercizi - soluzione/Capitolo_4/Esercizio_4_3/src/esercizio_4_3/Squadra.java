/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_3;

/**
 *
 * @author paolo
 */
public class Squadra {
    Giocatore V[];
    Squadra(int m, int n){
        V=new Giocatore[m+n];
        for(int i=0;i<m+n;i++){
            if(i<m)
                V[i]=new Portiere("Portiere "+i,(int)(Math.random()*20)+20,(int)(Math.random()*10));
            else
                V[i]=new Attaccante("Attaccante "+i, (int)(Math.random()*15)+18,(int)(Math.random()*40));
        }
    }
    String giocatorePiuCostoso(){
        String s="";
        int k=0;
        for(int i=0;i<V.length;i++){
            if(V[i].valore()>k){
                k=V[i].valore();
                s=V[i].nome;
            }
        }
        return s;
    }
    void mostra(){
        for(int i=0;i<V.length;i++){
            if(V[i] instanceof Portiere)
                System.out.println(V[i].nome +", "+V[i].eta+", "+((Portiere)V[i]).rigoriParati +", "+V[i].valore());
            else
                System.out.println(V[i].nome +", "+V[i].eta+", "+((Attaccante)V[i]).golSegnati +", "+V[i].valore());
        }
    }
}
