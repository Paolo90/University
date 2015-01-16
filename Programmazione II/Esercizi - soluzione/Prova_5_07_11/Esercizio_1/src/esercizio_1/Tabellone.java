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
public class Tabellone {
   Atleta V[];
   Tabellone(int n){
       V=new Atleta[n];
       int m=n/2;
       int i;
       for(i=0;i<m;i++){
           V[i]=new TennisMan("Tennista Uomo"+i,(int)(Math.random()*40),(int)(Math.random()*200));
       }
       for(;i<n;i++){
           V[i]=new TennisGirl("Tennista Donna"+i,(int)(Math.random()*35),Math.random()*100);
       }
   }
   int punteggioMassimo(int N){
       int i;
       int P=0;
       for(i=0;i<V.length;i++){
           int p=V[i].punteggio();
           if(V[i].eta==N && p>P)
               P=p;
       }
       return P;
   }
}
