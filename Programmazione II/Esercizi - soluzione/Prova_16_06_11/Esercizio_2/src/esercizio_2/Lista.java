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
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*15),testa);
        }
    }
    int conta(int n){
        int somma=0;
        for(Elemento e=testa;e!=null;e=e.next){
            if(e.n%2==0)
                e.n+=n;
            else
                somma+=e.n;
        }
        return somma;
    }
    void mostra(){
        for(Elemento e=testa;e!=null;e=e.next){
            System.out.print(e.n +" ");
        }
        System.out.println(" ");
    }
}
