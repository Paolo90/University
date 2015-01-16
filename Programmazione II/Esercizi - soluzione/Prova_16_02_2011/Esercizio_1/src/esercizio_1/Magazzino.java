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
public class Magazzino {
    Elettrodomestico[] V;
    Magazzino(int n, int m){
        V=new Elettrodomestico[n+m];
        int i;
        boolean b;
        int L,k;
        for(i=0;i<n;i++){ // Bianchi
            V[i]=new Bianchi("Bianco "+i, "marca"+(int)(Math.random()*(m+n)), (int)(Math.random()*500)+1,(int)(Math.random()*10));
        }
        for(int j=0;j<m;j++){
            k=i+j;
            L=(int)(Math.random()*2);
            if(L==0)
                b=false;
            else
                b=true;
            V[i+j]=new Neri("Nero "+k, "marca"+(int)(Math.random()*(m+n)), (int)(Math.random()*500)+1,b);
        }
    }
    double media(String marca){
        int C=0;
        int N=0;
        for(int i=0;i<V.length;i++){
            if(V[i].marca.equals(marca)){
                N++;
                C+=V[i].costo();
            }
        }
        return (double)C/N;
    }
}
