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
    Viaggiatore V[];
    Archivio(int n, int m){
        V=new Viaggiatore[n+m];
        int i;
        for(i=0;i<n;i++){
            V[i]=new Avventuriero("Avventuriero "+i, (int)(Math.random()*25)+1,(int)(Math.random()*10)+1);
            System.out.println(V[i].nome);
            System.out.println(V[i].giorniVacanza);
            System.out.println(((Avventuriero)V[i]).nazioniVisitate);
            System.out.println(V[i].costo());
        }
        for(int j=0;j<m;j++){
            V[i+j]=new Sedentario("Sedentario "+j, (int)(Math.random()*30)+1,(int)(Math.random()*5)+1);
            System.out.println(V[i+j].nome);
            System.out.println(V[i+j].giorniVacanza);
            System.out.println(((Sedentario)V[i+j]).numeroStelle);
            System.out.println(V[i+j].costo());
        }
    }
    int clientiFacoltosi(int c){
        int C=0;
        int costoAttuale;
        for(int i=0;i<V.length;i++){
            costoAttuale=V[i].costo();
            if(costoAttuale > c)
                C++;
        }
        return C;
    }
}
