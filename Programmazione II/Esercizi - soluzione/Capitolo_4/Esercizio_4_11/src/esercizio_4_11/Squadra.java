/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_11;

/**
 *
 * @author paolo
 */
public class Squadra {
    Giocatore V[];
    Squadra(int m, int n){
        V=new Giocatore[m+n];
        for(int i=0;i<m;i++){
            V[i]=new Portiere("Portiere "+i, (int)(Math.random()*20)+18, (int)(Math.random()*10));
        }
        for(int j=m;j<m+n;j++){
            V[j]=new Attaccante("Attaccante "+j, (int)(Math.random()*15)+18, (int)(Math.random()*20));
        }
    }
    String valorePiuAlto(){
        double max=0;
        double temp;
        int indice=0;
        for(int i=0;i<V.length;i++){
            temp=V[i].value();
            if(temp > max){
                max=temp;
                indice=i;
            }
        }
        return V[indice].name;
    }
}
