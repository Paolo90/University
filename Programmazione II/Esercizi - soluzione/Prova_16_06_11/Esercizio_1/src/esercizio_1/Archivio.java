/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;
import java.util.Random;

/**
 *
 * @author paolo
 */
public class Archivio {
    Programma V[];
    Archivio(int n, int m){
        V=new Programma[n+m];
        int i;
        Random r=new Random();
        for(i=0;i<n;i++){
            V[i]=new Film("Film "+i, Math.random()*15, r.nextBoolean());
            System.out.println("Titolo: "+V[i].titolo);
            System.out.println("Spettatori: "+V[i].spettatori);
            System.out.println("Italiano? "+((Film)V[i]).prodottoInItalia);
            System.out.println("Incasso: "+V[i].incassoPubblicita());
        }
        for(;i<m+n;i++){
            V[i]=new Approfondimento("Approfondimento "+i, Math.random()*6,r.nextBoolean());
            System.out.println("Titolo: "+V[i].titolo);
            System.out.println("Spettatori: "+V[i].spettatori);
            System.out.println("Italiano? "+((Approfondimento)V[i]).approfondimentoPolitico);
            System.out.println("Incasso: "+V[i].incassoPubblicita());
        }
    }
    int contaProgrammi(double n){
        int conta=0;
        for(int i=0;i<V.length;i++){
            if(V[i].incassoPubblicita()>n)
                conta++;
        }
        return conta;
    }
}
