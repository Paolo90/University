/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;

/**
 *
 * @author paolo
 */
public class Osservatorio {
    Pianeta V[];
    Osservatorio(int n){
        V=new Pianeta[n];
        int m=n/3;
        for(int i=0;i<n;i++){
            if(i<m){
                V[i]=new CrostaDura("Crosta Dura"+i,(int)(Math.random()*100),Math.random()*10000);
            }else{
                V[i]=new Gassoso("Gassoso"+i,(int)(Math.random()*100),(long)(Math.random()*100000));
            }
        }
    }
    int trovaVita(int n){
        int S=0;
        for(int i=0;i<V.length;i++){
            if(V[i].vita() > n)
                S++;
        }
        return S;
    }
}
