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
    int conta(String str){
        int S=0;
        for(Elemento e=testa;e!=null;e=e.next){
            if(e.s.compareTo(str)<0)
                S++;
        }
        return S;
    }
}
