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
            testa=new Elemento((int)(Math.random()*10),testa);
        }
    }
    void mostra(){
        for(Elemento e=testa;e!=null;e=e.next){
            System.out.print(e.value+" ");
        }
        System.out.println(" ");
    }
    int conta(int n){
        Elemento e=testa;
        int partial=0;
        int conta=0;
        while(e!=null && partial<=n){
            partial += e.value;
            conta++;
            e=e.next;
        }
        if(partial > n)
            return conta;
        else
            return -1;
    }
}