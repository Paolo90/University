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
    void mostra(){
        System.out.print("[ ");
        for(Elemento e=testa;e!=null;e=e.next){
            System.out.print(e.n+" ");
        }
        System.out.print("]");
        System.out.println("");
    }
    boolean verifica(){
        Elemento e=testa;
        Elemento f;
        boolean b=true;
        while(e!=null && b==true){
            if(e!=testa){
                f=testa;
                while(f!=e && b==true){
                    if(f.n < e.n)
                        f=f.next;
                    else
                        b=false;
                }    
            }
            if(b==true)
                e=e.next;
        }
        return b;
    }
}
