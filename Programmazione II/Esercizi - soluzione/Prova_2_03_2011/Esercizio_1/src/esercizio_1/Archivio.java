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
public class Archivio {
    Attore V[];
    Archivio(int n){
        int m=n/2;
        int i;
        V=new Attore[n];
        for(i=0;i<m;i++){
            V[i]=new Comico("Attore comico", (int)(Math.random()*85), (int)(Math.random()*40), (long)(Math.random()*10000000)); 
        }
        for(;i<n;i++){
            V[i]=new Drammaturgo("Attore drammatico", (int)(Math.random()*85), (int)(Math.random()*40), (int)(Math.random()*100)); 
        }
    }
    
    String vincitore(int N){
        double p;
        int i;
        for(i=0;i<V.length;i++){
            p=V[i].probabilitaVincita();
            if(p>N){
                break;
            }
        }
        if(i<V.length)
            return V[i].nome + " " + i;
        else
            return " ";
    }
}
